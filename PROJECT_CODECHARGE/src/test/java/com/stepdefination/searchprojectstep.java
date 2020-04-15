package com.stepdefination;

import java.io.IOException;

import com.baseclass.library;
import com.pages.loginpage;
import com.pages.searchproject;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchprojectstep extends  library{
	seleniumutill  util;
	searchproject search;
	loginpage login;
	@Given("^Open the website  Browser$")
	public void open_the_website_Browser() throws IOException  {
		
    launchApp();
	}
	@When("^Click On Task List$")
	public void click_On_Task_List() {	
		login = new loginpage(driver);
	    login.codecharge_enterusername("admin");
	    login.codecharge_enterpassword("admin");
	    login.codecharge_clickloginbtn();    
	    search = new  searchproject(driver);
	    search.click_tasklist();
	}

	@Then("^Select the Newly Entered Project$")
	public void select_the_Newly_Entered_Project()  {
		search = new  searchproject(driver);
		search.select_assingento();
		search = new  searchproject(driver);
		search.select_project();
		search = new  searchproject(driver);
		search.select_priority();
		search = new  searchproject(driver);
		search.select_status();
		search = new  searchproject(driver);
		search.select_type();
	}
	@And("^Click on the Search button$")
	public void click_on_the_Search_button() {
		search = new  searchproject(driver);
		search.clic_on_search();
		 util = new seleniumutill (driver);
			util.takescreenshot("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT1_CODECHARGE2\\src\\test\\resources\\screenshots\\search2.jpg");
		
		driver.quit();
	}
}