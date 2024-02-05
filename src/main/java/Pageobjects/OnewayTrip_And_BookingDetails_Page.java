package Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class OnewayTrip_And_BookingDetails_Page extends Utility{

	
	
	public WebDriver driver;
	
	public OnewayTrip_And_BookingDetails_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//div[contains(text(),'one way')]")
	WebElement oneway;
	
	@FindBy(xpath = "(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[1]")
	WebElement from_location;
	
	@FindBy(xpath = "(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[2]")
	WebElement to_location;
	
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-14lw9ot']//div[@class='css-1dbjc4n r-18u37iz']//div[1]//div[2]//div[2]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'nonzero')]")
	WebElement startdateicon;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[28]")
	WebElement date;
	
	
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement searchflight;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continuebtn;
	
	@FindBy(xpath = "(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[1]")
	WebElement fn;
    	
	@FindBy(xpath = "(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[2]")
	WebElement ln;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement mail;
	
	@FindBy(xpath = "(//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[4]")
	WebElement selectcity;
	
	@FindBy(xpath = "(//input[@class=\"css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy\"])[1]")
	WebElement mbl;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//div[@class='css-1dbjc4n r-zso239']//*[name()='svg']//*[name()='g' and contains(@fill,'#FFF')]//*[name()='rect' and contains(@width,'100%')]")
	WebElement ckbx;
	
	@FindBy(xpath = "//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73\"]")
	WebElement continuebtn2;
	
	
	public void one_way() throws InterruptedException {
		
		oneway.click();
		Thread.sleep(3000);

	}
	
	public void Selectdatae() throws InterruptedException {
		
		date.click();
		Thread.sleep(3000);

	}
	

	public void startloc() throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.doubleClick(from_location).build().perform();

		Thread.sleep(2000);

	}
	
	public void origin() throws InterruptedException {
		from_location.click();
		Thread.sleep(1000);

		from_location.clear();
		Thread.sleep(1000);

		from_location.sendKeys("Beng");
		Thread.sleep(3000);

	}
		

	
	
	public void reach() throws InterruptedException {
		
		to_location.sendKeys("Mum");
		Thread.sleep(3000);

	}
	
	
	public void search() throws InterruptedException {
		searchflight.click();
		Thread.sleep(3000);
		
	}
	
public void cntne() throws InterruptedException {
	
	continuebtn.click();
	Thread.sleep(3000);

}
	
	public void firstname () throws InterruptedException {
		
		fn.click();
		fn.sendKeys("Divagar");
		Thread.sleep(3000);

	}
	
	public void lastname() throws InterruptedException {
		ln.click();
		ln.sendKeys("V");
		Thread.sleep(3000);	
	}
	
	public void phone() {
		mbl.click();
		mbl.sendKeys("8438460925");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void email() {
		mail.click();
		mail.sendKeys("divagar@gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	public void city() {
		selectcity.click();
		selectcity.sendKeys("Bengaluru");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	
	public void passengerinfo() {
		ckbx.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
	}
	
	public void secondcntne() {
		
		continuebtn2.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	
}



