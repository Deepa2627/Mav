package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Cucumber_Project_Practice.BaseClass;
import com.pageobjectmanager.Page_Object_Manager;
import com.pomclass.*;
import com.properties.File_Reader_Manager;

import io.cucumber.java.en.*;

public class Step_Definition extends BaseClass{
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
@Given("User opens URL {string}")
public void user_opens_url(String string) {
  
urlLanuch(string);

}

@When("user enters {string} in the Username field")
public void user_enters_in_the_username_field(String string) {

passInput(pom.getInstanceLogin().getUname(), string);

}

@When("user enter {string} in the Password field")
public void user_enter_in_the_password_field(String string) {

	passInput(pom.getInstanceLogin().getPass(), string);

}

@Then("user Click the Login Button and it Navigates to the Search Hotel Page")
public void user_click_the_login_button_and_it_navigates_to_the_search_hotel_page() {

clickOnElement(pom.getInstanceLogin().getLogin());
	
}

	@Given("user selects {string} in the Location Field")
	public void user_selects_in_the_location_field(String string) {
	
dropDown(pom.getInstanceSearch().getLocation(), string);
}

@When("user selects {string} in the Hotel Field")
public void user_selects_in_the_hotel_field(String string) {
	
	dropDown(pom.getInstanceSearch().getHotel(), string);
}

@When("user selects {string} in the Room Type Field")
public void user_selects_in_the_room_type_field(String string) {
   
	dropDown(pom.getInstanceSearch().getRoom_type(), string);
}

@When("user selects {string} in the Number of Rooms Field")
public void user_selects_in_the_number_of_rooms_field(String string) {
   
	dropDown(pom.getInstanceSearch().getRoom_nos(), string);
}

@When("user selects {string} in the Number of Adults Field")
public void user_selects_in_the_number_of_adults_field(String string) {

	dropDown(pom.getInstanceSearch().getAdult_room(), string);
}

@When("user selects {string} in the Number of Childs Field")
public void user_selects_in_the_number_of_childs_field(String string) {

	dropDown(pom.getInstanceSearch().getChild_room(), string);
}

@Then("user Click the Submit Button and it Navigates to the Select Hotel Page")
public void user_click_the_submit_button_and_it_navigates_to_the_select_hotel_page() {

	clickOnElement(pom.getInstanceSearch().getSearch());
}

@When("user click the radiobutton in the Select Hotel Field")
public void user_click_the_radiobutton_in_the_select_hotel_field() {


	clickOnElement(pom.getInstanceSelect().getSelect());
}

@Then("user click the Submit Button and it Navigates to the Booking Page")
public void user_click_the_submit_button_and_it_navigates_to_the_booking_page() {

clickOnElement(pom.getInstanceSelect().getSubmit());

}

@When("user enter {string} in the Firstname Field")
public void user_enter_in_the_firstname_field(String string) {

passInput(pom.getInstanceBook().getFname(), string);
}

@When("user enter {string} in the Lastname Field")
public void user_enter_in_the_lastname_field(String string) {

	passInput(pom.getInstanceBook().getLname(), string);

}

@When("user enter {string} in the Address Field")
public void user_enter_in_the_address_field(String string) {

	passInput(pom.getInstanceBook().getAddress(), string);
}

@When("user enter {string} in the Credit Card number Field")
public void user_enter_in_the_credit_card_number_field(String string) {

	passInput(pom.getInstanceBook().getCno(), string);

}

@When("user selects {string} in the Creditcard Type Field")
public void user_selects_in_the_creditcard_type_field(String string) {

dropDown(pom.getInstanceBook().getCtype(), string);
}

@When("user selects {string} in the CredictCard ExpiryMonth Field")
public void user_selects_in_the_credict_card_expiry_month_field(String string) {

	dropDown(pom.getInstanceBook().getExpmon(), string);

}

@When("user selects {string} in the CreditCard ExpiryYear Field")
public void user_selects_in_the_credit_card_expiry_year_field(String string) {

dropDown(pom.getInstanceBook().getExpyear(), string);

}

@When("user enter {string} in the CVV Field")
public void user_enter_in_the_cvv_field(String string) {

	passInput(pom.getInstanceBook().getCvv(), string);

}

@Then("user click the Book Now Button and it confirms Booking")
public void user_click_the_book_now_button_and_it_confirms_booking() {

clickOnElement(pom.getInstanceBook().getBook());

}

@When("user click the Logout Button")
public void user_click_the_logout_button() {

clickOnElement(pom.getInstanceLogout().getLogout());
}

@Then("user close the current window")
public void user_close_the_current_window() {

windowClose();
}
}
