@compare
Feature: user can add any item he wants to his compare list

	Scenario: user can compare between two products
		Given user navigates to the home page of noPCommerce
		When user clicks on compare button
		Then item will be added to compare list successfully
		
		