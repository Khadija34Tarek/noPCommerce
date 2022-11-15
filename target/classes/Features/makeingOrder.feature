@order
Feature: user makes a successful order

	Scenario: user can make an order
		Given user navigates to shopping cart
		When user check on terms check box
		And clicks on checkout button
		And user fills out the information
		And clicks on continue button
		Then order will be successfully 