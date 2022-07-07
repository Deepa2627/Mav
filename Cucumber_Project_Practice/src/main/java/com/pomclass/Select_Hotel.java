package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	
	public WebDriver driver;
	
	public Select_Hotel(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "radiobutton_0")
	private WebElement select;

	@FindBy(name = "continue")
	private WebElement submit;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getSubmit() {
		return submit;
	}



}
