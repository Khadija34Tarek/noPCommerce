@hover
Feature: user can hover over different categories and its sub category
	
	Scenario: user hover over computers and its sub categories
		Given user navigates to home page
		When user hovers over computers
		And clicks on desktop as sub category
		Then user is navigated successfully to the page
		
		  