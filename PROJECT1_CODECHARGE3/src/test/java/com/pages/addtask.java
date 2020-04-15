package com.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class addtask {
	WebDriver driver ;
	
	By add_task1 = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
	By add_description1 = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/textarea");
	By add_project1 = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[4]");
	By  add_priority1 = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]");
	By add_status1= By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[5]");
	By add_type1= By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select/option[3]");
	By add_assingedto1= By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[7]/td/select/option[2]");
	By click_add1=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[10]/td/input[1]");
	Logger LOG = Logger.getLogger(addtask.class.getName());
	
	
	public addtask(WebDriver driver) {
		this.driver=driver;
	}
	
	//click the add_task
			public void add_task1() {
				driver.findElement(add_task1).sendKeys("cts");
				LOG.info(" task is added");
			}
	
			//click the add_description
			public void add_description1() {
				driver.findElement(add_description1).sendKeys("selenium training");
				LOG.info("description is added");
			}
			

			//click the add_project
			public void add_project1() {
				driver.findElement(add_project1).click();
				LOG.info(" project is added");
			}

			//click the add_priority
			public void add_priority1() {
				driver.findElement(add_priority1).click();
				LOG.info(" priorty is added");
			}

			//click the add_status
			public void add_status1() {
				driver.findElement(add_status1).click();
				LOG.info(" status is added");
			}

			//click the add_type
			public void add_type1() {
				driver.findElement(add_type1).click();
				LOG.info(" type is added");
			}

			//click the add_assingedto
			public void add_assingedto1() {
				driver.findElement(add_assingedto1).click();
				LOG.info(" product is added");
			}
			public void StartDate1() 
		    {
			        Actions action=new Actions(driver);
			        action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a/img"))).click().build().perform();
			        String parent=driver.getWindowHandle();
			        System.out.println(parent);
			        Set<String>allWindows=driver.getWindowHandles();
		      for(String Window:allWindows)
			   {
				      System.out.println(Window);
				      if(!parent.equalsIgnoreCase(Window))
				  {
					  driver.switchTo().window(Window);
				  }
				
			   }
			       Actions actions=new Actions(driver);
			       actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[5]/a"))).click().build().perform();
			       driver.switchTo().window(parent);
		    }
	// To select the End date	  
		public void EndDate1()
		   {
			      Actions action=new Actions(driver);
			      action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a/img"))).click().build().perform();
			      String parent=driver.getWindowHandle();
		          System.out.println(parent);
			      Set<String>allWindows=driver.getWindowHandles();
			      for(String Window:allWindows)
			   {
				     System.out.println(Window);
				     if(!parent.equalsIgnoreCase(Window))
				   {
					   driver.switchTo().window(Window);
				   }
			   }
			     Actions actions=new Actions(driver);
			     actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[5]/td[5]/a"))).click().build().perform();
			     driver.switchTo().window(parent);
		   }
			//click the add
			public void click_add1() {
				driver.findElement(click_add1).click();
				LOG.info("task  is added");
			}


	}
