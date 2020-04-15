package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



//Cucumber class
		@RunWith(Cucumber.class)
		@CucumberOptions
		(
		             features = "src/test/resources/feature/testcase.feature",
					 glue = {"com.stepdefination"},	 
					 plugin = {"pretty","html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
				        		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"}
				       
				        
		)
	
public class testrunner2 {
			
		  /*  @AfterClass
		      public static void  extendReport()
		    {
		        Reporter.loadXMLConfig("src\\test\\resources\\testdata\\extent-config.xml");
		        Reporter.setSystemInfo("user", System.getProperty("user.name"));
		        Reporter.setSystemInfo("os", "Windows");
		        Reporter.setTestRunnerOutput("Sample test runner output message");
		    }*/
		}