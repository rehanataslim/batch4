package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searachtask {
	WebDriver driver;
	Logger LOG = Logger.getLogger(searachtask.class.getName());
	searachtask login;
	By click_tasklist = By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a/img");
	By select_assignedto = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[2]");
	By select_project = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/select/option[4]");
	By select_priority = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[2]");
	By select_status= By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[5]");
	By select_type = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[3]");
	By clic_on_search = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input");

	
	public searachtask(WebDriver driver) {
		this.driver=driver;
	}
	
	//To click the tasklist
	public void click_tasklist() {			
		driver.findElement(click_tasklist ).click();
		LOG.info(" tasklist is clicked");
	}
			
	//To click the select_assingento 
	public void select_assingento() {
		driver.findElement(select_assignedto).click();
		LOG.info("Job assiger is selected ");
	}
	
	//To click on select_project
	public void select_project() {
		driver.findElement(select_project).click();
		LOG.info("project is selected");
		
	}
	
	//To click on select_priority
		public void select_priority() {
			driver.findElement(select_priority).click();
			LOG.info("priority is selected");
			
		}
		//To click on select_status
				public void select_status() {
					driver.findElement(select_status).click();
					LOG.info("status is selected");
					
				}
				//To click on select_type
				public void select_type() {
					driver.findElement(select_type).click();
					LOG.info("type is selected");
					
				}
	//To click the search button
	public void clic_on_search() {
		driver.findElement(clic_on_search).click();
		LOG.info("search button is clicked");
	}
	
	

}
