package Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Utility;

public class Sign_UP_Page_with_Invalid_Credentials extends Utility{

	
	//create webDriver variable
		public WebDriver driver;
		
		public Sign_UP_Page_with_Invalid_Credentials(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}
		
		// locate element on sign up page

		@FindBy(xpath = "(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"])[2]")
		WebElement ClickOnSignupButton;
		
	
		 @FindBy(xpath = "//Select[@class='form-control form-select ']") 
		 WebElement title;
		 
		 @FindBy(xpath = "//input[@id='first_name']")
		 WebElement firstname;
		 
		 @FindBy(xpath = "//input[@id='last_name']")
		 WebElement lastname;
		 
		 @FindBy(xpath = "//img[@class=\"d-inline-block datepicker\"]")
		 WebElement dob_box;
		 
		 @FindBy(xpath = "//select[@class=\"react-datepicker__month-select\"]")
		 WebElement dob_month;
		 
		 @FindBy(xpath = "//Select[@class=\"react-datepicker__year-select\"]")
		 WebElement dob_year;
		   
		 @FindBy(xpath = "//div[contains(@aria-label,'Choose Tuesday, December 19th, 1995')]")
		 WebElement dob_date;
		   
		 
		 @FindBy(xpath = "//input[@class=' form-control']") 
		 WebElement mobile;
		 
		 @FindBy(id = "email_id")
		 WebElement mail;
		 
		 @FindBy(xpath = "//input[@id='new-password']")
		 WebElement pswrd;
		 
		 @FindBy(xpath = "//input[@id='c-password']")
		 WebElement cpswrd;
		 
		 @FindBy(id = "defaultCheck1")
		 WebElement ckbx;
		 
		 
		 
	public void Click_On_Signup_Button()  {
		ClickOnSignupButton.click();
	}
	
	public void title () {
		title.click();
		Select sel1 = new Select(title);
		sel1.selectByValue("MR");
	}
	
	public void enter_firstname (String fn ) {
		
		firstname.click();
		firstname.clear();
		firstname.sendKeys(fn);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
   public void enter_lastname (String ln ) {
		
	   lastname.click();
	   lastname.clear();
	   lastname.sendKeys(ln);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

   public void country() throws InterruptedException {
		
		WebElement country = driver.findElement(By.xpath("//select[@class=\"form-control form-select\"]"));
		Select sel1 = new Select(country);
		sel1.selectByVisibleText("India");
	}
   
   
   public void clickdobbox() {
	   
	   dob_box.click();
	   dob_month.click();
	   Select sel2 = new Select(dob_month);
	   sel2.selectByValue("11");
	   dob_year.click();
	   Select sel3 = new Select(dob_year);
	   sel3.selectByValue("1995");
	   dob_date.click();
	   
   }
   
	public void enter_mbl (String mbl) {
		
		mobile.click();
		mobile.clear();
		mobile.sendKeys(mbl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void enter_email(String email) {
		
		mail.click();
		mail.clear();
		mail.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void enter_pswrd (String password) {
		
		pswrd.click();
		pswrd.clear();
		pswrd.sendKeys(password);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
	
	public void enter_cnfrmpswrd (String cnfrmpassword) {
		
		cpswrd.click();
		cpswrd.clear();
		cpswrd.sendKeys(cnfrmpassword);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
	
	
	public void checkbox() {
		
		ckbx.click();
		
	}
	
	public void page_validation() {
		
		String url = "https://spiceclub.spicejet.com/signup";
		                          
        if(url.equals(driver.getCurrentUrl())) {
			System.out.println("Signup validation test pass");
		}else {
			System.out.println("Signup validation test fail");
		}
	
	}
	
}
