package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Login_Page_With_invalid_credentials extends Utility{

	
	
	//create webDriver variable
			public WebDriver driver;
			
			public Login_Page_With_invalid_credentials(WebDriver driver) {
				
				this.driver = driver;
				PageFactory.initElements(driver, this);	
			}
			
			// locate element on sign up page

	
			@FindBy(xpath = "(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"])[1]")
			WebElement loginbtn;
			
			@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Mobile Number']")
			WebElement mbl_radiobtn;
			
			@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Email']")
			WebElement email_rdobtn;
			
			@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	        WebElement enter_mbl_nmbr;
			
			@FindBy(xpath = "//input[@type='password']")
	        WebElement enter_password;
			
			@FindBy(xpath = "//div[@class=\"css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73\"]")
	        WebElement click_on_login_btn;
			
			
			@FindBy(xpath = "//input[@type='email']")
			WebElement enteremail;
			
			
			public void first_time_login() {
				
				loginbtn.click();
				
			}
			
			public void mblrdobtn() {
				
				mbl_radiobtn.click();
			}
			
			public void entermobilenumber (String mbl) {
				
				enter_mbl_nmbr.sendKeys(mbl);
			}
			
			public void enterpswrd(String pswrd) {
				enter_password.sendKeys(pswrd);
			}
			
			public void login() {
				
				click_on_login_btn.click();
			}
			
		
			public void validate_login1() {
				
				String actual_title = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
				if(actual_title.equals(driver.getTitle())) {
					System.out.println("Login Test Pass");
				}else {
					System.out.println("Login Test Fails");
				}
				
			}
	
	
	public void emailbtn() {
		email_rdobtn.click();
	}
	
		
	public void enter_email(String rdobtn) {
		
		enteremail.click();
		enteremail.sendKeys(rdobtn);
	}
	
}
