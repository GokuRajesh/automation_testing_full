@post

Feature: Testing post request

Scenario: Testing the post api

Given The user is in the URL https://jsonplaceholder.typicode.com/posts
When he sends a POST request
Then he gets a status code of 201