package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;

public Book_Hotel(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "first_name")
	private WebElement fname;
	
	@FindBy(name = "last_name")
	private WebElement lname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement cno;
	
	@FindBy(name = "cc_type")
	private WebElement ctype;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expmon;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(name = "book_now")
	private WebElement book;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCno() {
		return cno;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	public WebElement getBook() {
		return book;
	}

	
	
	
}
