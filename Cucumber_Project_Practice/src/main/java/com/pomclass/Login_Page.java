package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	public Login_Page(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private  WebElement uname;

	@FindBy(id = "password")
	private  WebElement pass;
	
	@FindBy(name = "login")
	private  WebElement login;
	
	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}

	public WebElement getUname() {
		return uname;
	}
	
	
}
