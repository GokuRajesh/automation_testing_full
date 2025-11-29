Feature: Test a sample PUT API

  Background: 
  * url 'https://jsonplaceholder.typicode.com/posts/1'

  Scenario: Create a new object and verify success
    
    Given request
    """
    {
    "title": "foo",
  	}
    """
    
    When method DELETE
    
    Then status 200