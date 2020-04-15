
package com.stepdefination;

import java.io.IOException;

import com.baseclass.library;
import com.pages.add_newtask;
import com.pages.addtask;
import com.pages.loginpage;
import com.seleniumutillity.seleniumutill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class addtask_step  extends  library{
	
	seleniumutill  util;
	addtask newtask; 
	loginpage login;
	 
	 @Given("^launch the  website in the browser$")
		public void launch_the_Website_in_the_Browser() throws IOException  {
		    launchApp();

			
		}
	
	@Then("^click on addTask$")
		public void click_on_the_addNewTask() {
		login = new loginpage(driver);
	    login.codecharge_enterusername("admin");
	    login.codecharge_enterpassword("admin");
	    login.codecharge_clickloginbtn();		
		    
	   
		}
	 @Then("^enter all the details$")
		public void enter_all_the_details()  {
		 newtask = new addtask(driver);
		 newtask.add_task1();
		 newtask = new addtask (driver);
		 newtask.add_description1();
		 newtask = new addtask (driver);
		 newtask.add_project1();
		 newtask = new addtask (driver);
		 newtask.add_priority1();
		 newtask = new addtask (driver);
		 newtask.add_status1();
		 newtask = new addtask (driver);
		 newtask.add_type1();
		 newtask = new addtask (driver);
		 newtask.add_assingedto1();
		 newtask = new addtask (driver);
		newtask.StartDate1();
		 newtask = new addtask (driver);
		 newtask.EndDate1();
	 }
@And("^click on Add button$")
public void click_on_the_Add_button() {
	newtask = new addtask (driver);
	 newtask.click_add1();
	 util = new seleniumutill (driver);
		util.takescreenshot("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT1_CODECHARGE2\\src\\test\\resources\\screenshots\\addtask.jpg");
	 driver.quit();
}


}
