package testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pageobjects.OnewayTrip_And_BookingDetails_Page;
import base.BaseClass;

public class OnewayTrip_And_BookingDetails__Test extends BaseClass {

	@Test
	public void login() throws InterruptedException {
		
		OnewayTrip_And_BookingDetails_Page CL = new OnewayTrip_And_BookingDetails_Page(driver);
		
				


		CL.one_way();
Thread.sleep(5000);

		CL.startloc();
		Thread.sleep(5000);


		CL.origin();
		Thread.sleep(5000);

		CL.reach();
		Thread.sleep(5000);

		CL.Selectdatae();
		Thread.sleep(5000);

		
		CL.search();
		Thread.sleep(5000);

		CL.cntne();
		Thread.sleep(5000);

		CL.firstname();
		Thread.sleep(5000);

		CL.lastname();
		Thread.sleep(5000);

		CL.phone();
		Thread.sleep(5000);

		CL.email();
		
		CL.city();
		
		CL.passengerinfo();
		
		CL.secondcntne();


		
	}
	
	
	

	
}
