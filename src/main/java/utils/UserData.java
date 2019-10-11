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
import org.codehaus.plexus.util.cli.CommandLineUtils.StringStreamConsumer;


public class UserData {

	ArrayList<String> username = new ArrayList<String>();
	ArrayList<String> password = new ArrayList<String>();
	
	
	
	public ArrayList<String> getUsername() throws IOException{
		
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
				}
			
				//get all the data under user column and pass column
				Row r = null;
				while(rows.hasNext()){
				 r = rows.next();
					
					if(r.getCell(column) != null){
					
						//System.out.println("Username = "+r.getCell(column).getStringCellValue());
						username.add(r.getCell(column).getStringCellValue());
						
						
					}
						
				}
				
			
			
				
			}
		}
		return username;
		
	}
	
	public ArrayList<String> getPassword() throws IOException{
		
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
					
					int k=0,colpass=0;
					//match the cell value and fine the particular column value
					while(cell.hasNext()){
						Cell value = cell.next();
						if(value.getStringCellValue().equalsIgnoreCase("pass")){
							colpass=k;
						}
						k++;
					}
					//System.out.println("User col position = "+column);
					//System.out.println("Pass col position = "+colpass);
				
					//get all the data under user column and pass column
					Row r = null;
					while(rows.hasNext()){
					 r = rows.next();
					 Iterator<Cell> c = r.cellIterator();
					 Cell cv = c.next();
				//	System.out.println("hi"+cv);	
					 
						if(r.getCell(colpass) != null){
						
							if(cv.getCellType() == Cell.CELL_TYPE_STRING){
								password.add(r.getCell(colpass).getStringCellValue());
							}else if(cv.getCellType() == Cell.CELL_TYPE_NUMERIC){
								password.add(NumberToTextConverter.toText(r.getCell(colpass).getNumericCellValue()));
							}
							//System.out.println("Password = "+r.getCell(colpass).getStringCellValue());
							/*if(cv.getCellType()==Cell.CELL_TYPE_STRING){
								password.add(r.getCell(colpass).getStringCellValue());
							}else{
								password.add(NumberToTextConverter.toText(r.getCell(colpass).getNumericCellValue()));
							} */
						}
							
					}
					
			
					
				}
			}
			return password;
			
		}
	
	
		public static void main(String[] args) throws IOException {
		
			UserData ud = new UserData();
			ArrayList<String> user = ud.getUsername();
			ArrayList<String> pass = ud.getPassword();
			
			System.out.println(user.get(0));
			System.out.println(pass.get(0));
			
			System.out.println(user.get(1));
			System.out.println(pass.get(1));
			
			System.out.println(user.get(2));
			System.out.println(pass.get(2));
		}
		
	}

	

