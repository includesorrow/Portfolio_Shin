package kr.or.kosta.mvc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.TrafficVO;
import kr.or.kosta.mvc.dao.LoadPoiDao;
@RestController
@RequestMapping("/traffic")
public class LoadPoiController {
	
	@Autowired
	LoadPoiDao poiDao;
	
	@RequestMapping("/traffic1")
	public List<TrafficVO> readExsels() throws IOException {
		
		List<TrafficVO> list_vo = poiDao.readExsel();
		return list_vo;
	}
	
	
	@RequestMapping("/traffic_detail")
	public TrafficVO traffic_detail(int idx) throws IOException {
			TrafficVO vo = poiDao.traffic_detail(idx);
		return vo;
	}
	
	

}
