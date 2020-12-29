Feature: List users

  Scenario: Get users
    Given url "https://reqres.in/api/users?page=2"
    When method get
    Then match each response.data contains
       """
          { id: "#number", email: "#string", first_name: "#string", last_name: "#string", avatar: "#string"  }
       """
    And match response.data[*].id == [7,8,9,10,11,12]