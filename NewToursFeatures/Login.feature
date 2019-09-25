Feature: New tours login test feature

	Scenario: Login test scenario
	
		Given user is on login page
		When title of New tours is "Welcome: Mercury Tours"
		Then user enters username as "yogi" and password as "yogi"
		Then user click on sign on button
		Then user is on Find a Flight page
		Then user close the browser
		
	