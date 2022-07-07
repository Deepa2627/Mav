package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		
		return driver;
		
	}
	
	public static void urlLanuch(String url) {

		driver.get(url);
		
	}
	
	public static void passInput(WebElement element, String input) {
		
		element.sendKeys(input);
		
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static void dropDown(WebElement element, String text) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	public static void radioSelect(WebElement element) {
		
		element.click();
	}
	
	public static void screenShot(String location) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File(location);
		FileHandler.copy(src, desc);
	}
	
public static void windowClose() {
		
		driver.close();
	}
	
	public static void browserQuit() {
		
		driver.quit();
	}
	
}
