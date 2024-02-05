package testcases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import Pageobjects.Login_Page;
import Pageobjects.Login_Page_With_invalid_credentials;
import base.BaseClass;

public class Login_Test extends BaseClass {

	
	//drive the data from the excel to signuptestcase
			@DataProvider (name ="logindata")
			
			
			
			public Object[][] getsignupdata() throws IOException, InterruptedException{
				
				//create a file object frome where we want to pull the data
				
			
				FileInputStream fis = new FileInputStream("D:\\java exercise\\Project_2_Spcejet\\src\\main\\java\\resources\\SpiceJet.xlsx");
				
				// create a workbook object to handle the excel data
				Workbook wrkbk = WorkbookFactory.create(fis);
				
				//Access the sheet "login"
				Sheet sheet = wrkbk.getSheet("loginmbl");
				
				
				
				int rowcount = sheet.getLastRowNum();
				int colcount = sheet.getRow(0).getLastCellNum();
				
				//create a 2d array to store the data from the excel
				Object[][] data = new Object[rowcount][colcount];
				Thread.sleep(3000);
				
				
				//iterate through each coloumn in row
				
				for(int i=0;i<rowcount;i++) {
					
					//get the current row
					Row row = sheet.getRow(i+1);
					
					//iterate through coloumn
					for(int j=0; j<colcount;j++) {
						Cell cell = row.getCell(j);
						
						
						//store the cell value  --> check if the cell is null or not
						
						data[i][j] =(cell!=null)?cell.toString():null;
								
						
					}
					
				}
				
				
				return data;
				
			}
		
   @Test(dataProvider = "logindata" )
		
	public void login(String mbl, String pswrd, String rdobtn) throws InterruptedException, IOException {
	   Login_Page_With_invalid_credentials lp = new Login_Page_With_invalid_credentials(driver);
		
		lp.first_time_login();
		Thread.sleep(3000);
		
		lp.mblrdobtn();
		Thread.sleep(3000);
		
		lp.entermobilenumber(mbl);
		Thread.sleep(3000);
		
		lp.enterpswrd(pswrd);
		Thread.sleep(3000);
		
		lp.login();
		Thread.sleep(3000);
		
		lp.validate_login1();
		Thread.sleep(3000);
		
		
		
		lp.emailbtn();
		lp.enter_email(rdobtn);
		lp.login();
		
		com.takescreenshot(rdobtn, driver);
		
		
		
		
	}
	
	
}
