package or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.vo.ImageVO;

@Repository
public class ImageDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	public void inserti(ImageVO vo) {
		ss.insert("image.Imgin", vo);
	}
	public List<ImageVO> recenti(){
		return ss.selectList("image.recentImg");
	}
	public int imagechk(ImageVO vo) {
		return ss.selectOne("image.imagechk",vo);
	}
}
