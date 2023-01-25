Feature: Flipkart Homepage 

Scenario Outline: Navigating to flipkart homepage 
	Given user launch the chrome browser 
	When user is on google search page 
	Then user need to type <keyword> 
	Then user need to click on search button 
	Then user need to click on first link
	Then capture the page title
	Then user need to provide <emailorphone> and <password>
	Then user need to click on login button
	
Examples:
	
		| keyword | emailorphone | password |
		| flipkart | 7032659759 | bismillah-77 |
	