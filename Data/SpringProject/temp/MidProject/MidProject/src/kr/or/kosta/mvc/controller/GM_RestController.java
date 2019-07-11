package kr.or.kosta.mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kr.or.kosta.dto.GM_AgeVO;
import kr.or.kosta.dto.GM_MovieVO;
import kr.or.kosta.dto.GM_Movie_RatingVO;
import kr.or.kosta.dto.GM_RankVO;
import kr.or.kosta.dto.GM_ReviewVO;
import kr.or.kosta.mvc.dao.GM_MovieDao;

@RestController
@RequestMapping("/GM")
public class GM_RestController {
	
	private StringBuilder sb;
	
	@Autowired
	GM_MovieDao mdao;
	

	@RequestMapping("/getchart_data")
	public GM_AgeVO getchar_data() {
		GM_AgeVO avo = mdao.get_login_log_age();
		System.out.println(avo.getAge_10s());
		System.out.println(avo.getAge_20s());
		System.out.println(avo.getAge_30s());
		System.out.println(avo.getAge_40s());
		System.out.println(avo.getAge_50s());
		System.out.println(avo.getAge_60s());
		System.out.println(avo.getAge_70s());
		System.out.println(avo.getAge_80s());
		System.out.println(avo.getAge_90s());
		return avo;
	}
	
	@GetMapping("/getLink")
	public Map<String, Object> viewMovieDetail(String title, HttpSession session) {
		String movie_number = mdao.getMovie_number(title);
		
		System.out.println(title);
		Map<String, String> getRating_Map = new HashMap<String, String>();
		getRating_Map.put("movie_title", title);
		getRating_Map.put("member_id", session.getAttribute("uid").toString());
		String my_rating = mdao.getMyRating(getRating_Map);
		
		GM_MovieVO mov = mdao.getMovieVO(title);
		
		int p = mov.getMovie_price();
		boolean flag = false;
		int chk_event = mdao.chk_event(movie_number);
		if(chk_event != 0) {
			p--;
			flag = true;
		}
		
		int movie_price = 0;
		if(p == 5) {
			movie_price = 10000;
		}else if(p == 4) {
			movie_price = 5000;
		}else if(p == 3) {
			movie_price = 2500;
		}else if(p == 2) {
			movie_price = 1000;
		}else if(p == 1) {
			movie_price = 0;
		}
		if(my_rating == null) {
			my_rating = "0";
		}
//		String my_rating = "0";
		
		List<HashMap<String, String>> comment_list = getComment(movie_number);
		
		List<String> tag_list = mdao.get_movie_tag_list(movie_number);
		
		
		Map<String, Object> data = new HashMap<String, Object>();
		String URL = getMovie_Data(title);
		Document doc;
		try {
			doc=Jsoup.connect(URL).get();
			
//			System.out.println(doc);
			Elements content = doc.select("#content");
			String story1 = content.select(".story_area>.title_area").toString();
			String story2 = content.select(".story_area>.h_tx_story").toString();
			String story3 = content.select(".story_area>.con_tx").toString();
			String m_Title = content.select(".h_movie>a:nth-child(1)").text();
			String m_EngTitle = content.select(".h_movie2:nth-child(2)").text();
//			String m_rating = content.select(".main_score");
			String m_info_step1 = content.select(".info_spec>dd>p>span").text();
			String m_info_director = content.select(".info_spec>dd:nth-child(4)").text();
			String m_info_actor = content.select(".info_spec>dd:nth-child(6)>p").text();
			String m_info_filmrate = content.select(".info_spec>dd:nth-child(8)").text();
			String m_img = content.select(".poster:nth-child(2) img").toString();
			String m_story = story1+story2+story3;

			

			data.put("m_Title", m_Title);
			data.put("m_EngTitle", m_EngTitle);
			data.put("m_info_step1", m_info_step1);
			data.put("m_info_director", m_info_director);
			data.put("m_info_actor", m_info_actor);
			data.put("m_info_filmrate", m_info_filmrate);
			data.put("m_img", m_img);
			data.put("m_story", m_story);
			data.put("my_rating", my_rating);
			data.put("m_price", movie_price);
			data.put("tag_list", tag_list);
			data.put("event", flag);
			data.put("comment_list", comment_list);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
		
	}
	
	
	
	

	@GetMapping("/setRank")
	public String setRank(String movie_number, String rank, HttpSession session) {
		
//		String member_id = session.getAttribute("uid").toString();
		
//		int member_code = mdao.getMember_number(member_id);
		GM_RankVO rankvo = new GM_RankVO();
//		rankvo.setMember_number(member_code);
		rankvo.setMovie_number(movie_number);
		rankvo.setRank_number(Integer.parseInt(rank));
		int res_chk = mdao.chk_rank_list(rankvo);
		
		
		if(res_chk == 0) {
			mdao.add_rank(rankvo);
			return "success";
		}else if(res_chk == 1) {
			mdao.update_rank(rankvo);
			return "success";
		}else {
			return "error";
		}
		
		
	}
	
	public List<HashMap<String, String>> getComment(String movie_number){
		return mdao.get_movie_comment(movie_number);
	}
	
	@GetMapping("/setM_data")
	public String setM_data(String movie_number, int rating, String text, HttpSession session) {
		
		String member_id = session.getAttribute("member_id").toString();
		
		int member_code = mdao.getMember_number(member_id);
		
		int res_rating = addrating(movie_number, rating, member_code);
		
		int res_review = addreview(movie_number, text, member_code);
		
		if(res_rating == 1 && res_review == 1) {
			return "success";
		}else {
			return "error";
		}
		
		
	}
	
	public int addreview(String movie_number, String text, int member_number) {
		GM_ReviewVO rvo = new GM_ReviewVO();
		rvo.setMember_number(member_number);
		rvo.setMember_number(member_number);
		rvo.setUsedwords_contents(text);
		
		int res = mdao.add_review(rvo);
		
		return res;
		
	}
	
	
	public int addrating(String movie_number, int rating, int member_number) {
		GM_Movie_RatingVO mrvo = new GM_Movie_RatingVO();
		mrvo.setMovie_rating(rating);
		mrvo.setMember_number(member_number);
		mrvo.setMovie_number(movie_number);
		
		int chk_code = mdao.chk_Movie_rating(mrvo);
		if(chk_code == 0) {
			mdao.addMovie_rating(mrvo);
			return 1;
		}else if(chk_code == 1) {
			mdao.updateMovie_rating(mrvo);
			return 1;
		}else {
			return 0;
		}
		
	}
	
	
	

	public String getMovie_Data(String txt) {
		String clientId = "U8YzQ_7AjBaS8A19j_uR";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "YSP3_ozkfq";// 애플리케이션 클라이언트 시크릿값";\
		int display = 100; // 검색결과갯수. 최대100개

		try {
			int start = 1;
			while (true) {

				String text = URLEncoder.encode(txt, "utf-8");
				String apiURL = "https://openapi.naver.com/v1/search/movie.json?query=" + text + "&display=" + display
						+ "&start=" + start + "&";

				URL url = new URL(apiURL);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				con.setRequestProperty("X-Naver-Client-Id", clientId);
				con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
				int responseCode = con.getResponseCode();
				BufferedReader br;
				if (responseCode == 200) {
					br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				} else {
					br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "UTF-8"));
				}
				sb = new StringBuilder();
				String line;

				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}

				JSONParser parser = new JSONParser();
				JSONObject obj = (JSONObject) parser.parse(sb.toString());

				JSONArray parse_items = (JSONArray) obj.get("items");
				if (parse_items == null) {
					return "NoData";
				}
				for (Object parse_mv : parse_items) {

					JSONObject i = (JSONObject) parse_mv;
					String titleEx = i.get("title").toString();

					if (titleEx.length() > 7) {
						String title = titleEx.substring(3, titleEx.length() - 4);
						if (txt.equals(title)) {

							return i.get("link").toString();
						}
					}

				}
				start++;
				br.close();
				con.disconnect();
			}
//					System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";

	}

}
