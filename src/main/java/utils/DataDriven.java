package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven {

	
	public ArrayList<String> getData() throws IOException{
		//Array list to store data
		
				ArrayList<String> s = new ArrayList<String>();
				
				//Read file
				FileInputStream fis = new FileInputStream("E:/Abhishek/Alexa/Readuser.xlsx");
				//Workbook access
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				//access on worksheet
				
				//get total count of sheets here
				int totalSheets = workbook.getNumberOfSheets();
				
				for(int i=0; i<totalSheets; i++){
					XSSFSheet sheets = workbook.getSheetAt(i);
					
					//if sheet name matches
					if(sheets.getSheetName().equalsIgnoreCase("test")){
						
						//read all the rows in sheets
						Iterator<Row> rows = sheets.iterator();
						
						//read title row or first row
						Row titleRow = rows.next();
						
						//iterate cell value under a row
						Iterator<Cell> cell = titleRow.cellIterator();
						
						int k=0, column=0;
						//match the cell value and fine the particular column value
						while(cell.hasNext()){
							Cell value = cell.next();
							if(value.getStringCellValue().equalsIgnoreCase("user")){
								column=k;
							}
							k++;
							System.out.println(column);
						}
						//Now iterate all value or particular row under user
						
						while(rows.hasNext()){
							Row r = rows.next();
							
							if(r.getCell(column).getStringCellValue().equalsIgnoreCase("abhi")){
								Iterator<Cell> c = r.cellIterator();
						
								
								while(c.hasNext()){
						
									Cell cv = c.next();
									
									if(cv.getCellType()==Cell.CELL_TYPE_STRING){
										s.add(cv.getStringCellValue());
									}else{
										s.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
										
									}
									
									
								}
							
							}
							
						}
					}
				}
				return s;
				
	}
	
	public static void main(String[] args) throws IOException {
		
		DataDriven d = new DataDriven();
		
		ArrayList<String> ss = d.getData();
		
		System.out.println(ss.get(0));
		System.out.println(ss.get(1));
	}
	
}
