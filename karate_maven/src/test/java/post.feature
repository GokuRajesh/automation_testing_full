Feature: Test a sample POST API

  Background: 
  * url 'https://jsonplaceholder.typicode.com/posts'

  Scenario: Create a new object and verify success
    
    Given request
    """
    {
    "title": "foo",
    "body": "bar",
    "userId": 1,
  	}
    """
    
    When method POST
    
    Then status 201
    