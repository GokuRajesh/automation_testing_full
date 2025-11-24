@registration

Feature: Registering users
Scenario Outline: Testing registration feature
Given the user in the registration page
When he enters valid "<gender>" and valid "<firstname>" and valid "<lastname>" and valid "<email>"
Then the system navigates to home page of the user

Examples: 
|gender | firstname	    |		lastname	|	email			|
|male	|	Raj1		|		Leon1		|	rl@gmail.com	|
|male	|	Raj2		|		Leon2		|	rl@gmail.com	|
|female	|	Raj3		|		Leon3		|	rl@gmail.com	|
|male	|	Raj4		|		Leon4		|	rl@gmail.com	|
