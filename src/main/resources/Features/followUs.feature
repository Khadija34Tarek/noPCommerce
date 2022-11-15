@followus
Feature: user could open follow us links

	Scenario: user opens facebook link
		Given user opens first page
		When user clicks on facebook link
		Then user is navigated to facebook page
		
	Scenario: user opens twitter link
		Given user navigates to the first home page
		When user clicks on twitter link
		Then he is navigated to twitter page
		
	Scenario: user opens rss link
		Given user navigates to the page
		When user clicks on rss link
		Then user is navigated to page rss
		
	Scenario: user opens youtube link
		Given user navigates to the website first page
		When he clicks on the link
		Then he goes to that page
		