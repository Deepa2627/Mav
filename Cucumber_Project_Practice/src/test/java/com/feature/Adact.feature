Feature: Checking The Hotel Booking Functionality of an Adactin Application

@Login
Scenario: Login Functionality
Given User opens URL "https://adactinhotelapp.com/"
When user enters "Deepa2627" in the Username field
And user enter "Deepa1234" in the Password field
Then user Click the Login Button and it Navigates to the Search Hotel Page

@Search_Hotel
Scenario: Search Hotel Functionality
Given user selects "London" in the Location Field
When user selects "Hotel Sunshine" in the Hotel Field
And user selects "Standard" in the Room Type Field
And user selects "1 - One" in the Number of Rooms Field
And user selects "2 - Two" in the Number of Adults Field
And user selects "1 - One" in the Number of Childs Field
Then user Click the Submit Button and it Navigates to the Select Hotel Page

@Select_Hotel
Scenario: Select Hotel Functionality
When user click the radiobutton in the Select Hotel Field
Then user click the Submit Button and it Navigates to the Booking Page

@Book_Hotel
Scenario: Booking Hotel Functionality
When user enter "Deepa" in the Firstname Field
And user enter "Subu" in the Lastname Field
And user enter "Ramapuram" in the Address Field
And user enter "2345678912345423" in the Credit Card number Field
And user selects "VISA" in the Creditcard Type Field
And user selects "October" in the CredictCard ExpiryMonth Field
And user selects "2022" in the CreditCard ExpiryYear Field
And user enter "234" in the CVV Field
Then user click the Book Now Button and it confirms Booking

@Logout
Scenario: Logout Functionality
When user click the Logout Button 
Then user close the current window
