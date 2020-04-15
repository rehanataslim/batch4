package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class library {
	
	protected WebDriver driver;
	public static Properties prop;
	 	 public static   Logger LOG = Logger.getLogger(library.class.getName());
	 	 //To launch
	 public void launchApp() throws IOException {
		FileInputStream fis =new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT1_CODECHARGE2\\src\\test\\resources\\Configuration  Property\\Config.property");
		prop =new Properties();
		 prop.load(fis);
		 String browser = prop.getProperty("browser");	
		 //launch Chrome Browser
		 if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT1_CODECHARGE2\\src\\test\\resources\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 LOG.info("Chrome is Launched");		 
		 }
		 //Launch Firefox Broswer
		 else if (browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			 LOG.info("FireFox is Launched");
		 }
		
		 driver.manage().window().maximize();
		 LOG.info("Window is Maximized");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		 LOG.info("URL is entered");
	 
 }	
	 
 //To close the application
 public void quit() {
	  driver.close();
  }


}