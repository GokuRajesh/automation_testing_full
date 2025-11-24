@smoketesting

Feature: login to demo webshop

Background: User is in the login page

Scenario: login with with valid values
When he enters the valid details 
Then he reaches the home page

Scenario: login with with invalid values
When he enters the invalid details 
Then he reaches the home page