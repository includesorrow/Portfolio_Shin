package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class method {

public static void main(String[] args) {
	

	List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();


 
//SAMPLE DATA 생성
for(int i=0; i<=10; i++){ 
	Random generator = new Random();     
	Map<String, Object> tempMap = new HashMap<String, Object>();
	tempMap.put("price", i*generator.nextInt(10));
	tempMap.put("orderNumber", generator.nextInt(3));
	data.add(tempMap);
}

System.out.println("초기데이터::"+data);

//GROUP BY된 데이터를 받을 MAP
Map<String, Map<String, Object>> resultMap = new HashMap<String, Map<String, Object>>();
System.out.println(resultMap);




for(int i=0; i<data.size(); i++){
	String orderNumber = data.get(i).get("orderNumber").toString(); //KEY VALUE
	if(resultMap.containsKey(orderNumber)){
		//KEY값이 존재하면 해당 키값의 해당되는 가격을 가져와 더해줌
		resultMap.get(orderNumber).put("price", Integer.parseInt(resultMap.get(orderNumber).get("price").toString()) 
		+ Integer.parseInt(data.get(i).get("price").toString()));
	}else{
		//KEY값이 존재하지 않으면 MAP에 데이터를 넣어줌
		resultMap.put(orderNumber, data.get(i));
	}
}

System.out.println(resultMap);

}
}

