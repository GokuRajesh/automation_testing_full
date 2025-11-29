Feature: Testing delete request

Scenario: Testing the delete api

Given the user in the https://api.restful-api.dev/objects
When he sends delete request
Then he gets the response of 200