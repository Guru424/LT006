package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\output.xlsx");
	XSSFWorkbook     wb=new XSSFWorkbook(file);
	XSSFSheet     sheet=wb.getSheet("Output");
	
	XSSFRow row=sheet.createRow(1);
	XSSFCell cell=row.createCell(0);
	
	String text="Hello...Welcome to livetech";
	
	cell.setCellType(Cell.CELL_TYPE_STRING);
	cell.setCellValue(text);
	
	
	
	FileOutputStream fo=new FileOutputStream("D:\\LT007.xlsx");
	wb.write(fo);
	//fo.close();
	
	
	
	
}
}
