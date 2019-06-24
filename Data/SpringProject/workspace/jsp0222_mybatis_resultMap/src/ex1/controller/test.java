package ex1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

	
	public static void main(String[] args) {
		
	

String filePath = "파일을 생성시킬 위치";
String excelName = "생성할 엑셀의 이름";
Map<String,String> headerList = new HashMap<String,String>();
Map<String,String> list = new HashMap<String,String>();
List<dataType> data = "생성할 리스트를 담습니다.";
//headerList를 세팅할 만큼 세팅합니다.
headerList.put("0", "이름");
headerList.put("1", "이름");




//XSSFWorkbook 세팅
XSSFWorbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("sheet의 이름");
XSSFRow row = null;
XSSFCell cell = null;
for(int i=0; i<=data.size(); i++) {
	//data의 크기만큼 로우를 생성합니다.
	row=sheet.createRow((short)i);
	for(int k=0; k<headerList.size(); k++) {
		//headerList의 크기만큼 i번째 row에 cell을 생성합니다.
		cell=row.createCell(k);
		//맨윗줄에 headerList를 세팅합니다.
		if(i==0) {
			//CellStyle은 필요에따라서 세팅합니다.
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor("셀color 세팅");
			style.setFillPattern("셀의 패턴을 세팅");
			style.setAlignment("셀데이터의 정렬조건 세팅");
			cell.setCellStyle(style);
			sheet.setColumnWidth(index,"셀의 너비");
			//headerList의 데이터를 세팅
			cell.setCellValue(headerList.get(Integer.toString(k)));
		} 
		//엑셀파일에 넣을 데이터를 세팅합니다.
		else {
			//i-1을하는이유는 headerList가 i번쨰 row이기 때문.
			<dataType> excelData = data.get(i-1); 
			//리스트의 크기만큼 세팅합니다.
			list.put("0","넣을데이터");
			list.put("1","넣을데이터");
			.
			.
			.
			cell.setCellValue(list.get(Integer.toString(k)));
		}
	}
}
//엑셀파일 세팅 후 파일 생성
try {
	File file = new File(filePath);
	//file을 생성할 폴더가 없으면 생성합니다.
	file.mkdirs();
	FileOutputStream fileOutputStream = 
			new FileOutputStream(file+File.separator+excelName);
	//생성한 엑셀파일을 outputStream 해줍니다.
	workbook.write(fileOutputStream);
	fileOutputStream.close();
} catch(Exception e) {
	e.printStackTrace();
}

	
	
	
	
	
}
}