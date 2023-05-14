Feature: the contact button Functionality

Scenario: verify that the user can send massage with email, name and message are filled in.
    Given Access home page
    When Click contact button
    And Send message with input "<email>" and "<name>" and "<message>"
    Then Confirm "<popup>"
    Examples: 
    |email    						|name     |message				|popup   											|
    |nguyenhanh1@email.com|hanh			|thank you		  |	Thanks for the message!!		|
    
    #Scenario: verify that the user can not send massage when entering invalid format of email.
    #Given Access home page
    #When Click contact button
    #And Send message with input "<email>" and "<name>" and "<message>"
    #Then Confirm "<popup>"
    #Examples: 
    #|email    						|name     |message				|popup   											|
    #|nguyenhanh1@email|hanh			|thank you		  |	please re-enter your email format properly.		|
    #
    #Scenario: verify that the user can not send massage when email is left blank.
    #Given Access home page
    #When Click contact button
    #And Send message with input "<email>" and "<name>" and "<message>"
    #Then Confirm "<popup>"
    #Examples: 
    #|email    						|name     |message				|popup   											|
    #|											|hanh			|thank you		  |	please fill out email.		|
    #
    #Scenario: verify that the user can not send massage when name is left blank.
    #Given Access home page
    #When Click contact button
    #And Send message with input "<email>" and "<name>" and "<message>"
    #Then Confirm "<popup>"
    #Examples: 
    #|email    						|name     |message				|popup   											|
    #|nguyenhanh1@email.com|    			|thank you		  |	please fill out name.		|
    #
    #Scenario: verify that the user can not send massage when message is left blank.
    #Given Access home page
    #When Click contact button
    #And Send message with input "<email>" and "<name>" and "<message>"
    #Then Confirm "<popup>"
    #Examples: 
    #|email    						|name     |message				|popup   											|
    #|nguyenhanh1@email.com|hanh			| 						  |	please fill out message.		|
    
    Scenario: verify that user can close send message dialog when cliking on the close button.
	  Given Access home page
    When Click contact button then click close button
	  Then Confirm go to back homepage