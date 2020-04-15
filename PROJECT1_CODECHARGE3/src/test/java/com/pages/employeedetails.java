
package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class employeedetails {
	WebDriver driver;
	Logger LOG = Logger.getLogger(employeedetails.class.getName());
	By administration = By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a/img");
	By Employees = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[1]/td/a");
	//By addnewemployee = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[27]/td[1]/a");
	By emoly = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[1]/td[1]/a");
	By addnewpath = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[27]/td[1]/a");
	By name = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
	By email = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/input");
	By login = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input");
	By password = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/input");
	//By securitylevel = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select");
	By admin=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[2]");
	By add = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input[1]");
	//Logger LOG = Logger.getLogger(employeedetails.class.getName());
	
	public employeedetails(WebDriver driver) {
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
	public void to_emoly() {
		driver.findElement(emoly).click();
		LOG.info("addnewemployee is clicked");
	}
	public void to_click_addnewemployee() {
		driver.findElement(addnewpath).click();
		LOG.info("addnewemployee is clicked");
	}
	public void to_enter_name() {
		driver.findElement(name).sendKeys("anusha");
		LOG.info("new name is added");
	}
	public void to_enter_email() {
		driver.findElement(email).sendKeys("anusha@company.com");
		LOG.info("new email is added");
	}
	public void to_enter_login() {
		driver.findElement(login).sendKeys("admin");
		LOG.info("username is added for login");
	}
	public void to_enter_password() {
		driver.findElement(password).sendKeys("admin");
		LOG.info("password is added for login");
	}
	/*public void to_click_security_level() {
		driver.findElement(securitylevel).click();
		LOG.info("securitylevel is clicked");
	}*/
	public void to_click_admin() {
		driver.findElement(admin).click();
		LOG.info("admin is clicked");
	}
	public void to_click_add() {
		driver.findElement(add).click();
		LOG.info("new employee details is added");
	}
}



