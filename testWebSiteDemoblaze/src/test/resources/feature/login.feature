Feature: the log in Functionality

Scenario: verify that the user should login successfully with valid username and valid password
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm name of user "<nameofuser>"
    Examples: 
    |user    |pass    |nameofuser|
    |Hngoc1|hngoc1|Welcome Hngoc1|
    
    Scenario: verify that the user should not login with valid username but password is not filled in.
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |Hngoc1||Please fill out Username and Password.|
    
    Scenario: verify that the user should not login successfully with valid username and invalid password
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |Hngoc1|ngoc11ưe|Wrong password.|
    
    Scenario: verify that the user should not login successfully with username is not filled in and password is filled in.
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    ||hngoc1|Please fill out Username and Password.|
    
    Scenario: verify that the user should not login successfully when the user is not registered
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |ngoc22|ngoc22|User does not exist.|
    
    Scenario: verify that the user should not login successefully when username and password are not filled in.
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |||Please fill out Username and Password.|
    
    Scenario: verify that user can close login dialog when cliking on the close button.
	  Given Access home page
    When Click login button then click close button
	  Then Confirm go to back homepage
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    