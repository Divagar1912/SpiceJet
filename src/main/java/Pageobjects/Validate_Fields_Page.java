package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Validate_Fields_Page extends Utility{
	
	
	
	
public WebDriver driver;

	public Validate_Fields_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(partialLinkText = "Flight status")
	WebElement flightstatus;
	
	@FindBy(partialLinkText = "Check-in")
	WebElement checkin;
	
	@FindBy(partialLinkText = "manage booking")
	WebElement managebooking;
	
public void validate_checkin() {
	
	String title = "Check-in";

	if(title.contains("checkin")) {
		System.out.println("checkin is not available on this page");
	}else {
		System.out.println("checkin is available on this page");
	}
}
	

public void validate_flightstatus() {
	
	String title = "Flight status";

	if(title.contains("flightstatus")) {
		System.out.println("flightstatus is not available on this page");
	}else {
		System.out.println("flightstatus is available on this page");
	}
}

public void validate_managebooking() {
	
	String title = "manage booking";

	if(title.contains("managebooking")) {
		System.out.println("managebooking is not available on this page");
	}else {
		System.out.println("managebooking is available on this page");
	}
}




}


