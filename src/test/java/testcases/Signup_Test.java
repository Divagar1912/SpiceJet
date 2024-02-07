package testcases;


import org.testng.annotations.Test;

import Pageobjects.Signup_Page;
import base.BaseClass;




public class Signup_Test extends BaseClass {

	@Test
	
	public void signup() {
		
		Signup_Page sp = new Signup_Page(driver);
		
		sp.signup();
		sp.entername1();
		sp.enterpswrd1();
		sp.signup_btn();
		
		
	}
	
}
