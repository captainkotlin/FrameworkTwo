Feature: Create random UUID

  Scenario:
    * def uuidClass = Java.type("java.util.UUID");
    * def uuid = uuidClass.randomUUID().toString() + "@gmail.com"