package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.pageobjectmanager.Page_Object_Manager;
import com.properties.File_Reader_Manager;

public class Runner extends BaseClass{
	
	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws IOException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		urlLanuch(url);
		
		String uname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUname();
		passInput(pom.getInstanceLogin().getUname(), uname);
		
		String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPass();
		passInput(pom.getInstanceLogin().getPass(), pass);
		
		clickOnElement(pom.getInstanceLogin().getLogin());
		
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		dropDown(pom.getInstanceSearch().getLocation(), location);
		
		String hotels = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotels();
		dropDown(pom.getInstanceSearch().getHotel(), hotels);
		
		String room_type = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoom_type();
		dropDown(pom.getInstanceSearch().getRoom_type(), room_type);
		
		String room_nos = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoom_nos();
		dropDown(pom.getInstanceSearch().getRoom_nos(), room_nos);
		
		String adult_room = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult_room();
		dropDown(pom.getInstanceSearch().getAdult_room(), adult_room);
		
		String child_room = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChild_room();
		dropDown(pom.getInstanceSearch().getChild_room(), child_room);
		
		clickOnElement(pom.getInstanceSearch().getSearch());
		
		clickOnElement(pom.getInstanceSelect().getSelect());
		
		clickOnElement(pom.getInstanceSelect().getSubmit());
		
		String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFname();
		passInput(pom.getInstanceBook().getFname(), fname);
		
		String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLname();
		passInput(pom.getInstanceBook().getLname(), lname);
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceBook().getAddress(), address);
		
		String cno = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCno();
		passInput(pom.getInstanceBook().getCno(), cno);
		
		String ctype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCtype();
		dropDown(pom.getInstanceBook().getCtype(), ctype);
		
		String expmon = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpmon();
		dropDown(pom.getInstanceBook().getExpmon(), expmon);
		
		String expyear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpyear();
		dropDown(pom.getInstanceBook().getExpyear(), expyear);
		
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		passInput(pom.getInstanceBook().getCvv(), cvv);
		
		clickOnElement(pom.getInstanceBook().getBook());
		
		screenShot("C:\\Users\\Vanitha\\eclipse-workspace\\Maven_Project\\ScreenShots\\adactin.png");
		
		clickOnElement(pom.getInstanceLogout().getLogout());
		
	}
	
	
}
