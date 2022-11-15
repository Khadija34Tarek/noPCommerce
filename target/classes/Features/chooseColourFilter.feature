@filter
Feature: user can filter the products based on the colour he/she chooses
	Scenario: user selects a specific colour as the filter
		Given user navigates to home
		When user hovers over apparel and clicks on shoes 
		And chooses the filter 
		Then filter will be applied successfully 