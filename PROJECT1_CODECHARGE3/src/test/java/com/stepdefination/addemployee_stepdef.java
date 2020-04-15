package com.stepdefination;

import java.io.IOException;
import com.baseclass.library;
import com.pages.addemployee;
import com.pages.loginpage;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addemployee_stepdef extends library {
	seleniumutill  util;
	addemployee employee;
	loginpage login;
	
	 @Given("^Launch the Website in the Browser1$")
		public void launch_the_Website_in_the_Browser() throws IOException  {
		    launchApp();
		    login = new loginpage(driver);
		    login.codecharge_enterusername("admin");
		    login.codecharge_enterpassword("admin");
		    login.codecharge_clickloginbtn();	

			
		}
	@When("^I click on administration$")
	public void i_click_on_administration()  { 
	   employee = new addemployee(driver);
	   employee.to_click_administration();
	}

	@When("^I click on employees$")
	public void i_click_on_employees()  {
	   employee = new addemployee(driver);
	   employee.to_click_employees();
	}

	@Then("^I click on add new employee$")
	public void i_click_on_add_new_employee() {
		employee = new addemployee(driver);
		employee.to_click_addnewemployee();
		driver.quit();
	   }
	}
