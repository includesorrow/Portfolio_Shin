package kr.or.kosta.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class AdminAccountsMngService {

////@Inject
//	AdminAccountsMngMapper adminAccountsMngMapper;
//
//	public List<ExcelTestVO> xlsExcelReader(MultipartHttpServletRequest req) {
//		List<ExcelTestVO> list = new ArrayList<>();
//
//		MultipartFile file = req.getFile("excel");
//		HSSFWorkbook workbook = null;
//
//		try {
//			workbook = new HSSFWorkbook(file.getInputStream());
//
//			HSSFSheet curSheet;
//			HSSFRow curRow;
//			HSSFCell curCell;
//			ExcelTestVO vo;
//
//			for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
//				curSheet = workbook.getSheetAt(sheetIndex);
//				for (int rowIndex = 0; rowIndex < curSheet.getPhysicalNumberOfRows(); rowIndex++) {
//					if (rowIndex != 0) {
//						curRow = curSheet.getRow(rowIndex);
//						vo = new ExcelTestVO();
//						String value;
//
//						if (curRow.getCell(0) != null) {
//							if (!"".equals(curRow.getCell(0).getStringCellValue())) {
//								for (int cellIndex = 0; cellIndex < curRow.getPhysicalNumberOfCells(); cellIndex++) {
//									curCell = curRow.getCell(cellIndex);
//
//									if (true) {
//										value = "";
//										switch (curCell.getCellType()) {
//										case HSSFCell.CELL_TYPE_FORMULA:
//											value = curCell.getCellFormula();
//											break;
//										case HSSFCell.CELL_TYPE_NUMERIC:
//											value = curCell.getNumericCellValue() + "";
//											break;
//										case HSSFCell.CELL_TYPE_STRING:
//											value = curCell.getStringCellValue() + "";
//											break;
//										case HSSFCell.CELL_TYPE_BLANK:
//											value = curCell.getBooleanCellValue() + "";
//											break;
//										case HSSFCell.CELL_TYPE_ERROR:
//											value = curCell.getErrorCellValue() + "";
//											break;
//										default:
//											value = new String();
//											break;
//										} // end switch
//
//										switch (cellIndex) {
//										case 0:
//											vo.setCustId(value);
//											break;
//										case 1:
//											vo.setCustName(value);
//											break;
//										case 2:
//											vo.setCustAge(value);
//											break;
//										case 3:
//											vo.setCustEmail(value);
//											break;
//										default:
//											break;
//										}
//									} // end if
//								} // end for
//								list.add(vo);
//							} // end
//						} // end if
//					}
//
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		adminAccountsMngMapper.insertExcelTest(list);
//		return list;
//	}
//
//	public List<ExcelTestVO> xlsxExcelReader(MultipartHttpServletRequest req) {
//		List<ExcelTestVO> list = new ArrayList<>();
//
//		MultipartFile file = req.getFile("excel");
//		XSSFWorkbook workbook = null;
//
//		try {
//			workbook = new XSSFWorkbook(file.getInputStream());
//
//			XSSFSheet curSheet;
//			XSSFRow curRow;
//			XSSFCell curCell;
//			ExcelTestVO vo;
//
//			for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
//				curSheet = workbook.getSheetAt(sheetIndex);
//				for (int rowIndex = 0; rowIndex < curSheet.getPhysicalNumberOfRows(); rowIndex++) {
//					if (rowIndex != 0) {
//						curRow = curSheet.getRow(rowIndex);
//						vo = new ExcelTestVO();
//						String value;
//
//						if (curRow.getCell(0) != null) {
//							if (!"".equals(curRow.getCell(0).getStringCellValue())) {
//								for (int cellIndex = 0; cellIndex < curRow.getPhysicalNumberOfCells(); cellIndex++) {
//									curCell = curRow.getCell(cellIndex);
//
//									if (true) {
//										value = "";
//										switch (curCell.getCellType()) {
//										case HSSFCell.CELL_TYPE_FORMULA:
//											value = curCell.getCellFormula();
//											break;
//										case HSSFCell.CELL_TYPE_NUMERIC:
//											value = curCell.getNumericCellValue() + "";
//											break;
//										case HSSFCell.CELL_TYPE_STRING:
//											value = curCell.getStringCellValue() + "";
//											break;
//										case HSSFCell.CELL_TYPE_BLANK:
//											value = curCell.getBooleanCellValue() + "";
//											break;
//										case HSSFCell.CELL_TYPE_ERROR:
//											value = curCell.getErrorCellValue() + "";
//											break;
//										default:
//											value = new String();
//											break;
//										} // end switch
//
//										switch (cellIndex) {
//										case 0:
//											vo.setCustId(value);
//											break;
//										case 1:
//											vo.setCustName(value);
//											break;
//										case 2:
//											vo.setCustAge(value);
//											break;
//										case 3:
//											vo.setCustEmail(value);
//											break;
//										default:
//											break;
//										}
//									} // end if
//								} // end for
//								list.add(vo);
//							} // end
//						} // end if
//					}
//
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		adminAccountsMngMapper.insertExcelTest(list);
//		return list;
//	}

}