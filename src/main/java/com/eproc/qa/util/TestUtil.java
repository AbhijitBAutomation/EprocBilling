package com.eproc.qa.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.eproc.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT =20;
    public static long IMPLICIT_WAIT =20;
	public static Workbook book;
    public static Sheet sheet;

		public static FileInputStream fis;

		public static Object[][] getTestData(String sheetName)  {

			
			Object data[][]=null;
			try {
				fis = new FileInputStream(
						"D:\\Workspace\\JavaByKiran\\EprocBillingTest\\src\\"
						+ "main\\java\\com\\eproc\\qa\\testdata\\WebEPROCTestData.xlsx");
				book = WorkbookFactory.create(fis);
				sheet = book.getSheet(sheetName);
				int row = sheet.getLastRowNum();
				int col = sheet.getRow(0).getLastCellNum();
				
				data = new Object[row][col];
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						
						data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
						
					}
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return data;
		}
	}

	
	
	


