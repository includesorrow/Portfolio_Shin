package kr.or.kosta.mvc.controller;

import java.util.ArrayList;import java.util.HashMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.ChartVO;


/*
 * 
 * */
@RestController
public class Ajax_Json_Controller {
	
	@RequestMapping(value="/stringify", method=RequestMethod.POST)
    @ResponseBody
    public Object stringify(@RequestBody ChartVO chartvo) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", chartvo.getAnalysistitle());
        map.put("price",chartvo.getAnalysisprice());
        map.put("tag",chartvo.getAnalysistag());
       
        return map;
    }
	//��Ʈ�� ���� ��Ʈ�ѷ�
	//ChartVO�� �޴´�.
	//���⼭ Hashmap + Ajax + Property�� �����.
	
	    @PostMapping("/restController")
	    public Object restController(@RequestBody ChartVO chartvo) {
	        ArrayList<String> arrList = new ArrayList<String>();
	      
	            arrList.add(chartvo.getAnalysistitle());
	            arrList.add(chartvo.getAnalysisprice());
	            arrList.add(chartvo.getAnalysistag());
	        
	        return arrList;
	    }
	    //restController
	    //��Ʈ�� ���� POST������� �ϴ� ��Ʈ�ѷ� ������.
	}

	
	
