Feature: the place order Functionality

Scenario: verify that a dialog is shown when clicking on the place order button
    Given Access home page
    When choose "<type>" "<product>" to cart and click place order
    Then Confirm place order "Place order"
    
    Examples: 
   |type|product|
	 |Phones|Samsung galaxy s6|
#	 |Phones|Nokia lumia 1520|
#	 |Laptops|2017 Dell 15.6 Inch|
    
    Scenario: verify that the total price in the dialog place order is displayed properly
    Given Access home page
    When choose "<type>" "<product>" to cart and click place order
    Then Confirm total "<total>"
    
     Examples: 
    |type|product|total|
    |Phones|Samsung galaxy s6|Total: 360|
    #|Phones|Nokia lumia 1520|Total: 820|
    #|Phones|Nexus 6|Total: 650|
    
    Scenario: verify that user is able to place order when entering valid dialog content 
    Given Access home page
    When choose "<type>" "<product>" to cart and click place order
    And fill in "<name>" "<card>" infomation and click purchase
    Then Confirm purchase "Thank you for your purchase!"
    
    Examples:
   |type|product|name|card|
	 |Phones|Samsung galaxy s6|Ngoc|12345|
#	 |Phones|Nokia lumia 1520|Ngoc|12345|
#	 |Phones|Nexus 6|Ngoc|12345|
#	 |Phones|Samsung galaxy s7|Ngoc|12345|
#	 |Phones|Iphone 6 32gb|Ngoc|12345|
#	 |Phones|Sony xperia z5|Ngoc|12345|
#	 |Phones|HTC One M9|Ngoc|12345|
	 |Laptops|Sony vaio i5|Ngoc|12345|
	 |Laptops|Sony vaio i7|Ngoc|12345|
#	 |Laptops|MacBook air|An|12345|
#	 |Laptops|Dell i7 8gb|An|12345|
#	 |Laptops|2017 Dell 15.6 Inch|An|12345|
#	 |Laptops|MacBook Pro|An|12345|
	 |Monitors|Apple monitor 24|Ngoc|12345|
	 |Monitors|ASUS Full HD|Ngoc|12345|
	 
	 Scenario: verify that user can not place order 
    Given Access home page
    When choose "<type>" "<product>" to cart and click place order
    And fill in "<name>" "<card>" infomation and click purchase
    Then Confirm message "Please fill out Name and Creditcard."
    
     Examples:
   |type|product|name|card|message|
	 |Phones|Samsung galaxy s6||12345|Please fill out Name and Creditcard.|
	 |Phones|Nokia lumia 1520|Ngoc||Please fill out Name and Creditcard.|
	 |Phones|Nexus 6|||Please fill out Name and Creditcard.|
#	 |Laptops|Sony vaio i5||12345|Please fill out Name and Creditcard.|
#	 |Laptops|Sony vaio i7|Ngoc||Please fill out Name and Creditcard.|
#	 |Laptops|MacBook air|||Please fill out Name and Creditcard.|
#	 |Monitors|Apple monitor 24||12345|Please fill out Name and Creditcard.|
#	 |Monitors|ASUS Full HD|Ngoc||Please fill out Name and Creditcard.|
#	 Monitors|ASUS Full HD|||Please fill out Name and Creditcard.|
    
    
    Scenario: verify that user can go back home page when click ok button then purchase
    Given Access home page
    When choose "<type>" "<product>" to cart and click place order
    And fill in "<name>" "<card>" infomation and click purchase
    And click ok
    Then Confirm url 
    
    Examples:
   |type|product|name|card|
	 |Phones|Samsung galaxy s6|Ngoc|12345|
#	 |Phones|Nokia lumia 1520|Ngoc|12345|