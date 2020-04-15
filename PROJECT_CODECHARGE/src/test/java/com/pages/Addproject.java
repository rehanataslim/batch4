package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addproject {

	WebDriver driver;
    By click_administration = By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a/img");
	By click_project = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td/a");
	By Add_new_project = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[7]/td/a");
	By enter_poject_name = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
	By Add = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/input[1]");

	
	Logger LOG =  Logger.getLogger(Addproject.class.getName());
	
	public Addproject(WebDriver driver) {
		 this.driver= driver;
	}
	//click the click_administration
			public void click_administration() {
				driver.findElement(click_administration).click();
				LOG.info("administration is clicked");
			}
	
	//click the project
	public void To_clickproject() {
		
		driver.findElement( click_project).click();
		LOG.info("project is clicked");
	}
	
	//click the project
		public void To_click_Add_new_project() {
			
			driver.findElement(Add_new_project).click();
			LOG.info(" new  project is clicked");
		}
		//to enter the data
	public void to_enter_data() {
		driver.findElement(enter_poject_name).sendKeys("codecharge_taskmanager");
		LOG.info("google is entered");
	}
	public void To_click_Add() {
		
		driver.findElement(Add).click();
		LOG.info(" new project is added ");
	}
	
}