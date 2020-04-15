
package com.stepdefination;

import java.io.IOException;

import com.baseclass.library;
import com.pages.loginpage;
import com.pages.searachtask;
import com.pages.searchproject;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchtaskstep extends  library{
	 seleniumutill   util;
	 searachtask search;
	loginpage login;
	@Given("^open the prequisite browser$")
	public void launch_the_Website_in_the_Browser() throws IOException  {
		
    launchApp();
	}
	@When("^Click On Task List$")
	public void click_On_Task_List() {	
		login = new loginpage(driver);
	    login.codecharge_enterusername("admin");
	    login.codecharge_enterpassword("admin");
	    login.codecharge_clickloginbtn();    
	    search = new  searachtask(driver);
	    search.click_tasklist();
	}

	@Then("^enter the Task details$")
	public void select_the_task()  {
		search = new  searachtask(driver);
		search.select_assingento();
		search = new  searachtask(driver);
		search.select_project();
		search = new  searachtask(driver);
		search.select_priority();
		search = new  searachtask(driver);
		search.select_status();
		search = new  searachtask(driver);
		search.select_type();
	}
	@And("^click on search button1$")
	public void click_on_the_Search_button1() {
		search = new  searachtask(driver);
		search.clic_on_search();
		 util = new seleniumutill (driver);
			util.takescreenshot("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT1_CODECHARGE2\\src\\test\\resources\\screenshots\\search.jpg");
		driver.quit();
	}
}