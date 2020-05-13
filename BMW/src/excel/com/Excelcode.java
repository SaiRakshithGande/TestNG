package excel.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode {
	public void ExcelFile() {
	File file = new File("C:\\Users\\Varun\\Documents\\Speed.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet she = wb.createSheet("Sheet 1");
	she.createRow(0).createCell(0).setCellValue("does not meet my requirement");
	FileOutputStream fos = null;
	try {
	fos = new FileOutputStream(file);
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}
	try {
	wb.write(fos);
	} 
	catch (IOException e1) {
	e1.printStackTrace();
	}
	}
}

	


