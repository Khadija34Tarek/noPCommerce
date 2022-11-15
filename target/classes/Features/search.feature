@search
Feature: user can search for anything

	Scenario: user could search using product name
		Given user navigates to the home page
		When user clicks on the search bar 
		And search for "<searchElements>"
		And press on search button
		Then user navigates to results "<searchElements>" page successfully

		Examples:
		
		| searchElements | 
		| book |
		| laptop |
		| nike |
	
	
	