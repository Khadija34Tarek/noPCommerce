@cart
Feature: user an add any item to his cart
	
	Scenario: user adds a product to his shopping cart successfully
		Given user goes to website homepage
		When user scrolls down and clicks on add to cart
		And user chooses Ram and HDD
		And clicks on add to cart button 
		Then product will be successfully added