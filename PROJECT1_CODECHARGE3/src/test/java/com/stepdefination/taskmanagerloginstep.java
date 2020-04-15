package com.stepdefination;

import java.io.IOException;


import com.baseclass.library;
import com.pages.loginpage;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class taskmanagerloginstep extends  library{
	loginpage login;
	seleniumutill util;
    
	@Given("^Open the  taskmanager website  Browser$")
	public void launch_the_browser() throws IOException {
    	
    	launchApp();
	   	}
	
	
	
	
	
	@Then("^enter the \"([^\"]*)\" and \"([^\\\"]*)\"$")
	public void enter_Username_and_Password(String username1, String password1) {
		login = new  loginpage(driver);
		login.codecharge_enterusername(username1);
		login.codecharge_enterpassword(password1);
		
	}
	

	@And("^click on Login button1$")
	public void click_on_Login_button()  {
	login = new  loginpage(driver);
	   login.codecharge_clickloginbtn();
	   util = new seleniumutill (driver);
		util.takescreenshot("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT1_CODECHARGE2\\src\\test\\resources\\screenshots\\login.jpg");
	   driver.quit();
	}

	
}
