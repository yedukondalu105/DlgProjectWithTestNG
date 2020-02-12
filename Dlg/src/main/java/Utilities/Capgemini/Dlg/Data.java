package Utilities.Capgemini.Dlg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	
	public void getData(){
		File src=new File("./Resources/TestData.xlsx");
		try {
			
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("NewSheet1");
			
			System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
			int rowNum=sheet.getLastRowNum();
			Iterator itrRow=sheet.rowIterator();
			Iterator itrCell;
			
			Row row=(Row) itrRow.next();
			itrCell=row.cellIterator();
			int count=0;
			while(itrCell.hasNext()){
				Cell cell=(Cell) itrCell.next();
				if(cell!=null){
					
					count++;
				}
				else{
					break;
				}
				
			}
			System.out.println("Column count is :"+count);
			for(int i=0;i<rowNum;i++){
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
				System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
				
			}
			//Code to write data into Excel
			FileOutputStream fos =new FileOutputStream(src);
			sheet.getRow(0).createCell(2).setCellValue("Status");
			wb.write(fos);
			wb.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
