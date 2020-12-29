Feature: Get User

  Background:
    * url gorestUrlBase

  Scenario Outline: Get user with id
    Given path "users", <id>
    When method get
    Then match response == <expectedResponse>

    Examples:
      | read('getuser.csv') |