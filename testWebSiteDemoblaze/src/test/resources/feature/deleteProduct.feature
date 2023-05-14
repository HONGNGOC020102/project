Feature: delete product from cart

Scenario: the user is able to delete product from cart when clicking on the delete button
    Given Access home page
    When Choose "<type>" "<product>" to cart
    And Click cart and delete product
    Then Confirm delete success
    
    Examples: 
    |type|product|
	 |Phones|Samsung galaxy s6|