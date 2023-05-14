
Feature: check screen Home Page

  Scenario: go to the Home page by button
    Given Access web page
    When Clicking Home button
    Then Display Home page

  Scenario: display new message dialog
    Given Access web page
    When Clicking Contact button
    Then Display new message dialog "New message"
    
  Scenario: display about us popup
    Given Access web page
    When Clicking AboutUs button
    Then Display about us popup "About us"
    
  Scenario: go to the cart page when click button 
    Given Access web page
    When Clicking cart button
    Then Display cart page
    
  Scenario: display login dialog
    Given Access web page
    When Clicking login button
    Then Display login dialog "Log in"
    
  Scenario: display sign up dialog
    Given Access web page
    When Clicking Sign up button
    Then Display Sign up dialog "Sign up"

 	Scenario: verify that product will displayed when clicking on the product button
    Given Access web page
    When Choose "<type>" and "<product>"
    Then Verify "<product>" title product "<titleproduct>"
    
    Examples:
   |type					|product   |titleproduct|
   |Phones|Samsung galaxy s6|Samsung galaxy s6|
	 |Phones|Nokia lumia 1520|Nokia lumia 1520|
	 |Laptops|2017 Dell 15.6 Inch|2017 Dell 15.6 Inch|
    
    Scenario: the footer is displayed properly
    Given Access web page
    Then Display footer tittle "About Us"
    
    
    
