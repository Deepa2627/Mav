package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {

	
public WebDriver driver;
	
	public Logout_Page(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "logout")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

}
