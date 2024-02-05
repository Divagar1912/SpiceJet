package testcases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import Pageobjects.Sign_UP_Page;
import Pageobjects.Sign_UP_Page_with_Invalid_Credentials;
import base.BaseClass;

public class Sign_Up_Test extends BaseClass {

	//drive the data from the excel to signuptestcase
		@DataProvider (name ="signupdata")
		
		
		
		public Object[][] getsignupdata() throws IOException, InterruptedException{
			
			//create a file object frome where we want to pull the data
			
		
			FileInputStream fis = new FileInputStream("D:\\java exercise\\Project_2_Spcejet\\src\\main\\java\\resources\\SpiceJet.xlsx");
			
			// create a workbook object to handle the excel data
			Workbook wrkbk = WorkbookFactory.create(fis);
			
			//Access the sheet "signup"
			Sheet sheet = wrkbk.getSheet("signup");
			
			
			
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
	
	
	@Test(dataProvider = "signupdata" )
	public void signup(String fn, String ln, String mbl, String email, String password, String cnfrmpassword) throws InterruptedException, IOException {
		Sign_UP_Page_with_Invalid_Credentials sp = new Sign_UP_Page_with_Invalid_Credentials(driver);
				
		
		sp.Click_On_Signup_Button();
		
		sp.Switchwindow();

		sp.title();

		sp.enter_firstname(fn);

		sp.enter_lastname(ln);

		sp.country();

		sp.clickdobbox();
		
		com.scroll();

		sp.enter_mbl(mbl);

		sp.enter_email(email);

		sp.enter_pswrd(password);

		sp.enter_cnfrmpswrd(cnfrmpassword);

		sp.checkbox();
	
		com.takescreenshot("Signup", driver);

	}
	
	
	
}
