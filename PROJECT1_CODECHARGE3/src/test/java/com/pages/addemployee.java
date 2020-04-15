
package com.pages;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addemployee {
	WebDriver driver;
	By administration = By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a/img");
	By Employees = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[1]/td/a");
	By addnewemployee = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[27]/td[1]/a");
	Logger LOG =  Logger.getLogger(addemployee.class.getName());
	
	public addemployee(WebDriver driver) {
		this.driver=driver;
	}
	public void to_click_administration() {
		driver.findElement(administration).click();
		LOG.info("administration is clicked");
		}
	public void to_click_employees() {
		driver.findElement(Employees).click();
		LOG.info("Employees is clicked");
	}
	public void to_click_addnewemployee() {
		driver.findElement(addnewemployee).click();
		LOG.info("addnewemployee is clicked");
	}
}