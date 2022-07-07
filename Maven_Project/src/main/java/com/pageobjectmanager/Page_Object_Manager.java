package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pomclass.Book_Hotel;
import com.pomclass.Login_Page;
import com.pomclass.Logout_Page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver;
	private Login_Page lp;
	private Search_Hotel sh;
	private Select_Hotel st;
	private Book_Hotel bk;
	private Logout_Page lop;
	
	public Page_Object_Manager(WebDriver driver1) {
		
		this.driver=driver1;
		
	}
	
	public Login_Page getInstanceLogin() {
		
		if(lp==null) {
			
			lp =new Login_Page(driver);
		}
	return lp;
	}

public Logout_Page getInstanceLogout() {
	
	if(lop==null) {
		
		lop =new Logout_Page(driver);
	}
return lop;
}

public Search_Hotel getInstanceSearch() {
	
	if(sh==null) {
		
		sh =new Search_Hotel(driver);
	}
return sh;
}

public Select_Hotel getInstanceSelect() {
	
	if(st==null) {
		
		st =new Select_Hotel(driver);
	}
return st;
}

public Book_Hotel getInstanceBook() {
	
	if(bk==null) {
		
		bk =new Book_Hotel(driver);
	}
return bk;
}

}

