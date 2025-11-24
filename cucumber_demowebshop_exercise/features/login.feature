@login
Feature: login users

Scenario Outline: Log in with valid values
Given the user in the login page
When he enters valid "<password>" and valid "<email>"
Then the system navigates to home page of the user login

Examples: 
|		password	|	email			|	
|		Leon1		|	rl@gmail.com	|
|		Leon2		|	rl1@gmail.com	|

Scenario Outline: Log in with invalid values
Given the user in the login page
When he enters invalid "<password>" and invalid "<email>"
Then the system navigates to home page of the user login

Examples: 
|		password			|	email			|	
|		invalidLeon1		|	rl				|
|		invalidLeon2		|	rl3				|