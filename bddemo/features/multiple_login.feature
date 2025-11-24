@login

Feature:Login with different users
Scenario Outline: login with multiple values

Given the user in the login window
When he enters valid "<username>" and valid "<password>"
Then he reaches the home page

Examples:
|username 	|	password	|
|username1	|	password1	|
|username2	|	password2	|