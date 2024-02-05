package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Pageobjects.Round_Trip_And_BookingDetails_Page;
import base.BaseClass;

public class Round_Trip_And_BookingDetails_Test extends BaseClass {
	
	@Test
	public void booking() throws InterruptedException {
		
		Round_Trip_And_BookingDetails_Page RT = new Round_Trip_And_BookingDetails_Page(driver);
		
		
		RT.flightclick();
		RT.radiobtn();
		RT.startloc();
		RT.origin();
		RT.reach();
		RT.date_confirmation();
		RT.search();
		RT.cn1();
		RT.firstname();
		RT.lastname();
		RT.phone();
		RT.email();
		RT.city();
		RT.passengerinfo();
		RT.secondcntne();
		RT.secondcntne();
		RT.validation();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
