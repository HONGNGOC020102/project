Feature: the Sign up Functionality

Scenario: verify that user can sign up successfully with valid username and valid password.
    Given Access home page
    When Click signup button
    And Signup with input "<user>" and "<pass>"
    Then Display error message "<errorMessage>"
    Examples: 
    |user    |pass    |errorMessage|
    |Hngoc9|hngoc9|Sign up successful.|
    
Scenario: verify that user can not sign up successfully when username is not filled in and password is filled in.
     Given Access home page
     When Click signup button
    And Signup with input "<user>" and "<pass>"
    Then Display error message "<errorMessage>"
    Examples: 
    |user    |pass    |errorMessage|
    ||hngoc7|Please fill out Username and Password.|

#Scenario: verify that user can not sign up successfully when username is more than 10 characters and password is filled in.
    #Given Access home page
     #When Click signup button
    #And Signup with input "<user>" and "<pass>"
    #Then Display error message "<message>"
    #Examples: 
    #|user    |pass    |message|
    #|Hngoc22222224|hngoc7|please re-enter your username from 6 to 10 characters.|
    
Scenario: verify that user can not sign up successfully with valid username, but password is not filled in
	  Given Access home page
     When Click signup button
    And Signup with input "<user>" and "<pass>"
	 Then Display error message "<errorMessage>"
	  Examples: 
    |user    |pass    |errorMessage|
    |Hngoc5|          |Please fill out Username and Password.|

#Scenario: verify that user can not sign up successfully with valid username but password is less than 6 characters.
     #Given Access home page
     #When Click signup button
    #And Signup with input "<user>" and "<pass>"
    #Then Display error message "<message>"
    #Examples: 
    #|user    |pass    |message|
    #|Hngoc6|hngo|please re-enter a password of 6 or more characters.|
        
Scenario: verify that user can not sign up successfully when username and password are not filled in
	 Given Access home page
     When Click signup button
    And Signup with input "<user>" and "<pass>"
	 Then Display error message "<errorMessage>"
	  Examples: 
    |user    |pass    |errorMessage|
    |||Please fill out Username and Password.|
  
Scenario: verify that user can not sign up successfully when username already exist and password is filled in.
	  Given Access home page
     When Click signup button
    And Signup with input "<user>" and "<pass>"
	 Then Display error message "<errorMessage>"
	  Examples: 
    |user    |pass    |errorMessage|
    |Hngoc7  |hngoc7  |This user already exist.|
    
Scenario: verify that user can close sign up dialog when cliking on the close button.
	  Given Access home page
    When Click signup button then click close button
	  Then Confirm go to back homepage


