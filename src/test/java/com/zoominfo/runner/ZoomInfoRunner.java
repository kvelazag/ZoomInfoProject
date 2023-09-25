package com.zoominfo.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import zoombase.Base;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\zoominfo\\feature\\", glue = "com.zoominfo.stepdefinition",
monochrome = true, plugin = {"html:Reports/CucumberHTMLreports",
		"json:Reports/CucumberJSONreport.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberExtentReport.html"})


public class ZoomInfoRunner extends Base {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setupBrowser() throws IOException {
		
		launchBrowser("Chrome");
		 
	}
//	@AfterClass
//	public static void closeBrowser() {
//		
//		Base.closeBrowser();
//	}

}
