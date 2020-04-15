package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpage {
	
	Logger LOG = Logger.getLogger( loginpage.class.getName());
	WebDriver driver;
	
	By username1 = By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td[2]/input");
	By  Password1 = By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[2]/input");
	By loginbutton  = By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input");
	
	//constructor
	public  loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//Enter username
	public void codecharge_enterusername(String username) {
		
		driver.findElement(username1).sendKeys(username);
		LOG.info("enter  name in the   username filed ");
		
	}
	//Entering the password
		public void codecharge_enterpassword(String password) {
			driver.findElement(Password1).sendKeys(password);
			LOG.info("Enterd password in tbe Password field");
		}
		
		//click the login button
		public void codecharge_clickloginbtn() {
			driver.findElement(loginbutton).click();
			LOG.info("Login Button is Clicked");
			//driver.quit();
			
		}

}
