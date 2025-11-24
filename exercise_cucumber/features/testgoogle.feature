Feature: Testing google Th

Scenario Outline: Search with mutiple values
Given the user in the google page
When he enters the "<keyword>" to search and submits
Then the user clicks to first link

Examples:
|keyword|
|qtp	|
|selenium	|
|rft	|