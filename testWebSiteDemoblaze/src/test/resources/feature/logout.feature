Feature: logout funtion

Scenario: verify that the user should logout successfully when click logout button
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    And Click logout
    Then Confirm logout cuccess 
    Examples: 
    |user    |pass    |nameofuser|
    |Hngoc1|hngoc1|Welcome Hngoc1|