package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pageobjects.Validate_Fields_Page;
import base.BaseClass;

public class Validate_Fields_Test extends BaseClass{
	
	@Test
	public void validating_fields() {
		
		
		Validate_Fields_Page vf = new Validate_Fields_Page(driver);
		
		vf.validate_checkin();
		vf.validate_flightstatus();
		vf.validate_managebooking();
		
		
		
		
		
	}

}
