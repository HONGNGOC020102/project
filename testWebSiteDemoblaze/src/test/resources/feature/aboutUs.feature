Feature: View about us 

Scenario: verify that screen will show "about us video" when clicking "about us" button
    Given Access home page
    When Click aboutus button
    Then Confirm "Pause"
   
    Scenario: verify that user can close send message dialog when cliking on the close button.
	  Given Access home page
    When Click about us button then click close button
	  Then Confirm go to back homepage
	  
#	  Scenario: verify that the user can not watch "about us" video when clicking "pause" button
#	  Given Access home page
    #When Click aboutus button
    #And click pause button
    #Then Confirm "<video>"