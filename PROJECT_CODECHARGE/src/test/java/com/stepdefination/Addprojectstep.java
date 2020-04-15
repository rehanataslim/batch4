package com.stepdefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.baseclass.library;
import com.pages.Addproject;
import com.pages.loginpage;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addprojectstep extends  library {
	
	loginpage  login;
	
	seleniumutill util;
	Addproject  addproject;

	@Given("^Open the Website in the Browser$")
	public void open_the_Website_in_the_Browser() throws IOException  {
		
		launchApp();
	}

	
	@When("^Click on the Projects$")
	public void click_on_the_Projects()   {
		
		login = new loginpage(driver);
	    login.codecharge_enterusername("admin");
	    login.codecharge_enterpassword("admin");
	    login.codecharge_clickloginbtn();
	 
	    addproject = new  Addproject(driver);

	    //addproject.click_administration();
	    //addproject = new Addproject(driver);
	    addproject.To_clickproject();
	    
	}
	@When("^click on the administration$")
	public void click_on_the_administration() {
		 addproject = new Addproject(driver);
		 addproject.click_administration();
		    
		
	}

	@When("^Click on the Add New Project$")
	public void click_on_the_Add_New_Project() {
		
		addproject = new Addproject(driver);
		addproject.To_click_Add_new_project();
	}

	@Then("^Enter the Project Name$")
	public void enter_the_Project_Name()  {
		addproject = new Addproject(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addproject.to_enter_data();
	}

	@And("^Click on the Add Button$")
	public void click_on_the_Add_Button()  {
		addproject = new Addproject(driver);
		addproject.To_click_Add();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}


	
}