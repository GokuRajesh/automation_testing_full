Feature: Test a sample PUT API

  Background: 
  * url 'https://jsonplaceholder.typicode.com/posts/1'

  Scenario: Create a new object and verify success
    
    Given request
    """
    {
    "title": "foo",
    "body": "bar",
    "userId": 1,
  	}
    """
    
    When method PUT
    
    Then status 200
    