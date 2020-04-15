package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
	WebDriver driver;
	//loginpage login;
	Logger LOG =  Logger.getLogger(logout.class.getName());
	By click_administration = By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a/img");
	By click_logout = By.xpath("/html/body/p/a");

	
	
	public logout(WebDriver driver) {
		 this.driver= driver;
	}
	//click the click_administration
	public void click_administration() {
		driver.findElement(click_administration).click();
		LOG.info("administration is clicked");
	}
	//click the add click_logout type
	public void click_logout() {
		driver.findElement(click_logout).click();
		LOG.info("logout is clicked");
	}

}
