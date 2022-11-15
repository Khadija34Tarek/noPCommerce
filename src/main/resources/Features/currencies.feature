@currencies 
Feature: user can change currency in his account

	Scenario: user switches between currencies
	Given user goes to home page
	When user clicks on currency drop down menu
	And chooses euro
	Then user switched currency successfully 
	