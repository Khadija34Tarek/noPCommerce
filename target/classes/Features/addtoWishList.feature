@wish
Feature: user can add any item to his wish list

	Scenario: user adds a specific product to his wishlist
		Given user navigates to the home page of the website
		When user scrolls down and clicks on heart icon
		And chooses the RAM and HDD he wants
		And clicks on add to wish list button
		Then product will be added successfully to wishList