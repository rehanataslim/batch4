package com.stepdefination;

import java.io.IOException;

import com.baseclass.library;
import com.pages.loginpage;
import com.pages.logout;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class logoutstep   extends library {
	seleniumutill  util;
	logout click; 
	loginpage login;
	
	 @Given("^Launch the Website Browser$")
		public void Launch_the_Website_Browser() throws IOException  {
		    launchApp();
		    login = new loginpage(driver);
		    login.codecharge_enterusername("admin");
		    login.codecharge_enterpassword("admin");
		    login.codecharge_clickloginbtn();	
		   
				}
	 
	 
	 
	 @And("^click administration$")
	 public void click_administration() { 
		 click = new logout(driver);
		 click.click_administration();
		}
	 @And("^click the logout$")
	 public void click_the_logout() {
		 click = new logout(driver);
		 click.click_logout();
		 driver.quit();
	 }
}
