package testcases;


import org.testng.annotations.Test;

import Pageobjects.Payment_Page;
import base.BaseClass;

public class Payment_Test extends BaseClass {

	@Test
	
	public void payment() {
		
		Payment_Page pp = new Payment_Page(driver);
		
		pp.cardnmbr();
		pp.name();
		pp.month();
		pp.year();
		pp.cvv();
		pp.payment();
		pp.validation();
	}
	
	
}
