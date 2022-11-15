@tags
Feature: user can select any tag he wants from product page

	Scenario: user select a specific tag
		Given user navigate to any product page
		When user scrolls down
		And clicks on a specific tag
		Then the tag will be applied on the page