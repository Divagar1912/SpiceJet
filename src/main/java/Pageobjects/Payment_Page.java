package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Utility;

public class Payment_Page extends Utility {

	public WebDriver driver;

	
       public Payment_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	

       @FindBy(id = "card_number")
       WebElement carddetails;
       
       @FindBy(id = "name_on_card")
       WebElement nameoncard;
       
       @FindBy(id = "card_exp_month")
       WebElement mnth;
       
       @FindBy(id = "card_exp_year")
       WebElement year;
       
       @FindBy(id = "security_code")
       WebElement cvv;
       
       @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
       WebElement proccedtopay;
       
       @FindBy(id = "payment_Confirmation")
       WebElement paymentConfirmationMessage;
       
       public void cardnmbr() {
    	   carddetails.click();
    	   carddetails.sendKeys("123456789122");
    	   
       }


       public void  name() {
    	   nameoncard.click();
    	   nameoncard.sendKeys("Raj Kumar");
       }
       
       
       public void  month() {
    	   nameoncard.click();
    	   nameoncard.sendKeys("12");
       }


       public void  year() {
    	   year.click();
    	   year.sendKeys("29");
       }

       public void cvv() {
    	   cvv.click();
    	   cvv.sendKeys("345");
       }
       
       public void payment() {
    	   proccedtopay.click();
       }
       
       public void validation() {
       
       if (!paymentConfirmationMessage.isDisplayed()) {
           System.out.println("Payment failed!");
       } else {
           System.out.println("Payment was successful!");
       }
      
       }
}
