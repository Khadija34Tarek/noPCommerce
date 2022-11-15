@register
Feature: user could register with new account

	Scenario: user could register with valid data successfully
		Given user goes to register page
		When user select gender type
		And user enters first name "automation" and last name "tester"
		And user enter date of birth
		And user enter email "test@example.com" field
		And user fills the password fields "P@ssw0rd" "P@ssw0rd
		And user clicks on register button
		Then success message is displayed
		