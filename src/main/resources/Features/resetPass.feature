@resetpass
Feature: user reset his/her password easily

	Scenario: user can reset his password when he is logged in
		Given user navigates to the sites home page
		When user clicks on login
		And pass the email 
		And clicks on forget password
		And user enters his own email
		And clicks on recover button
		Then a pop up message appears
		