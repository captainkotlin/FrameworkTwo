Feature: List is sortable

  Background:
    Given url = "https://demoqa.com/sortable" and list tab selected

  Scenario Outline:
    When div <fromDiv> is dragged to <toDiv>
    Then list is correctly sorted
    Examples:
      | fromDiv | toDiv  |
      | "One"   | "Four" |
      | "One"   | "Six"  |
      | "Six"   | "One"  |