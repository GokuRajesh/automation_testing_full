Feature: Testing patch request

Scenario: Testing the patch api

Given the user in the https://api.restful-api.dev/objects
When he sends Patch request
Then he gets the response of 200