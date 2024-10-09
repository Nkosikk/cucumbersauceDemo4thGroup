Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that ad user screen is displayed
    And The user enters firstName <firstName>
    Examples:
      | firstName |
      | Nkosi     |