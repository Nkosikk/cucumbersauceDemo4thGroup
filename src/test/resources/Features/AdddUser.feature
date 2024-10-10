Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that ad user screen is displayed
    And The user enters firstName <firstName>
    And The user enters lastName <lastName>
    And The user enters userName <userName>
    And The user enters password <password>

    Examples:
      | firstName | lastName | userName     | password |
      | Simo      | Mkhasibe | SimoMkhasibe | Test12$  |