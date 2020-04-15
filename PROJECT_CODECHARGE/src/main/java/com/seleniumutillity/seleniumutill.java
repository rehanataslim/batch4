package com.seleniumutillity;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.library;

public class seleniumutill  extends  library{
	
             WebDriver driver;
 WebDriverWait wait; 
 By loginbutton = By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input");  
//constructor
 public  seleniumutill(WebDriver driver){
	 
	 this.driver=driver;
	 
 }
//to get the title
 public void gettitle() {
	 
	 System.out.println("titile of page"+driver.getTitle());
 }
//explicit wait
 public void explictvoid() {
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loginbutton)));
	 
 }
 public void  takescreenshot(String path1) 
	{

		TakesScreenshot screenshot = (TakesScreenshot)driver;
    File Source = screenshot.getScreenshotAs(OutputType.FILE);
    try {
			FileUtils.copyFile(Source, new File(path1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}





	
}
