package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
public WebDriver driver;
	
	public Search_Hotel(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotel;
	
	@FindBy(name = "room_type")
	private WebElement room_type;
	
	@FindBy(name = "room_nos")
	private WebElement room_nos;
	
	@FindBy(name = "adult_room")
	private WebElement adult_room;
	
	@FindBy(name = "child_room")
	private WebElement child_room;
	
	@FindBy(name = "Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch() {
		return search;
	}

		

}
