Feature: Checkout the product

Background: 
	Given user launch the chrome browser 
	When user is on google search page 
	Then user need to type flipkart keyword
	Then user need to click on google search button 
	Then user need to click on first link

	
Scenario Outline:
	Given user is on flipkart homepage
	When user needs to provide <emailorphone> and <password>
	Then user need to click on login button
	Then user need to click on global search bar 
	And user needs to type <text> in the search bar
	Then user need to click on global search button
	Then user needs to click on required game
	Then user needs to click on add to cart button
	And user needs to click on place order button
	Then user needs to increase the quantity
	And user needs to click on continue button
	Then user needs to click on UPI radio button
	And user needs to click on phonepe radio button
	And user needs to click on continue button again
	Then user needs to verify the first line on phonepe page
	
	
	Examples:
	| emailorphone | password | text |
	| 7032659759   | bismillah-77 | games |
