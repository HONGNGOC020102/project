Feature: the add to cart Functionality

Scenario: verify that the user is able to add product to cart when clicking on the add to cart button
    Given Access home page
    When Choose "<type>" "<product>" to cart
    Then Confirm product added "Product added"
    
    
    Examples: 
   |type|product|
	 |Phones|Samsung galaxy s6|
#	 |Phones|Nokia lumia 1520|
#	 |Laptops|2017 Dell 15.6 Inch|
    
    Scenario: Verify that the product is displayed properly in cart
    Given Access home page
    When Choose "<type>" "<product>" to cart
    And Click cart button
    Then Confirm title "<title>"
     Examples: 
    |type|product|title|
    #|Phones|Samsung galaxy s6|Samsung galaxy s6|
    #|Phones|Nokia lumia 1520|Nokia lumia 1520|
    |Laptops|Nexus 6|Nexus 6|
    
    Scenario: Verify that the price is displayed properly in cart
    Given Access home page
    When Choose "<type>" "<product>" to cart
    And Click cart button
    Then Confirm price "<price>"
     Examples: 
    |type|product|price|
    #|Phones|Samsung galaxy s6|360|
    |Phones|Nokia lumia 1520|820|
    #|Laptops|Nexus 6|650|