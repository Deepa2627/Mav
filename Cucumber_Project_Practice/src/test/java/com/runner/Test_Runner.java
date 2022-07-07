package com.runner;

import java.io.File;
import java.io.IOException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Project_Practice.BaseClass;
import com.cucumber.listener.Reporter;
import com.properties.File_Reader_Manager;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adact.feature",
glue = "com.stepdefinition", monochrome = true, 
plugin = {"html:test-output/Reports.html"} )
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver=BaseClass.browserLaunch("chrome");
	}

	@AfterClass
	public static void writeExtentReport() throws IOException {
		
		Reporter.loadXMLConfig(new File(File_Reader_Manager.getInstanceFRM().getInstanceCR().getReportConfigPath()));
	}
	
}
