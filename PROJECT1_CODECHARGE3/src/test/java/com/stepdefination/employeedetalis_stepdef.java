package com.stepdefination;

import java.io.IOException;
import com.baseclass.library;
import com.pages.employeedetails;
import com.pages.loginpage;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class employeedetalis_stepdef extends library {
	seleniumutill  util;
	loginpage login;
		employeedetails details;

		 @Given("^Launch the Website in the Browser$")
			public void launch_the_Website_in_the_Browser() throws IOException  {
			    launchApp();
			    login = new loginpage(driver);
			    login.codecharge_enterusername("admin");
			    login.codecharge_enterpassword("admin");
			    login.codecharge_clickloginbtn();	

				
			}
		@Then("^I enter all the details of employee$")
	public void I_enter_all_the_details_of_employee() {
			details = new employeedetails(driver);
			   details.to_click_administration();
			   details = new employeedetails(driver);
			   details.to_click_employees();
			   details = new employeedetails(driver);
			   details.to_emoly();
			   details = new employeedetails(driver);
			   details.to_click_addnewemployee();
			
			
			
	   details = new employeedetails(driver);
	   details.to_enter_name();
	   details = new employeedetails(driver);
	   details.to_enter_email(); 
	   details = new employeedetails(driver);
	   details.to_enter_login();
	   details = new employeedetails(driver);
	   details.to_enter_password();
	   details = new employeedetails(driver);
	   details. to_click_admin();
	   }

		@And("^I click on Add button$")
	public void I_click_on_Add_button() throws Throwable {
		 details = new employeedetails(driver);
		 details.to_click_add();
			
		 driver.quit();
	}
}







