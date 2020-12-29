Feature: Create user

  Scenario Outline:
    * def randomUUID = call read("classpath:sharedfeature/randomuuid.feature")
    Given url gorestUrlBase
    And path "users"
    And header Authorization = "Bearer " + gorestBearer
    And request
    """
    {
      "email": "#(randomUUID.uuid)",
      "name": "<name>",
      "gender": "<gender>",
      "status": "<status>"
    }
    """
    When method post
    Then status 200
    Then match response.code == 201
    Then match response.data contains { id: "#number" }

    Examples:
      |  read("createusers.csv") |