package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLExcel {
public static void main(String[] args) throws BiffException, IOException {
	
	FileInputStream file=new FileInputStream("D:/Guru/input.xls");
	Workbook         wb=Workbook.getWorkbook(file);
	Sheet          sheet=wb.getSheet("Input");
	
	int rows=sheet.getRows();
	int columns=sheet.getColumns();
	
	System.out.println("Total number of rows ="+rows);
	System.out.println("Total number of columns ="+columns);
	
	String text=sheet.getCell(0, 1).getContents();
	System.out.println(text);
	
	
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
			String value=sheet.getCell(j, i).getContents();
			System.out.println(value);
		}
	}
}
}
