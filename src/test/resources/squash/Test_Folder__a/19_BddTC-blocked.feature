# language: en
Feature: BddTC-blocked

	Scenario: BddTC-blocked
		Given today is saturday
		When i am at home
		Then i dont need to go to work
		Given i am at home
		Given i am here
		Given i am at home
		Given i dont need to go to work
		Given i dont need to go to work