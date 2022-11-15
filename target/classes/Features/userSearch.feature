@searchsku
Feature: user can search using sku

	Scenario:  user could search for a product using sku
		Given user navigates to the page home
		When user clicks on search bar
		And search for a product "<searchElements>"
		Then user will navigates to the results "<searchElements>" page successfully
		
		Examples:
		
		| searchElements | 
		| SCI_FAITH |
		| APPLE_CAM |
		| SF_PRO_11 |