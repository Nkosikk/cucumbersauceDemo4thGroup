Feature: User Table

  Scenario Outline: Add user to the table
    Given The user table is displayed
    And The user click add user
    And The user validates that ad user screen is displayed
    And The user enters firstName <firstName>
    And The user enters lastName <lastName>
    And The user enters username <userName>
    And The user enters password <password>
    And The user selects customer type
    And The user selects user role <userRole>
    And The user enters email address <emailAddress>
    And The user enters cell phone number <cellPhoneNumber>
    And The user click the save button
    And The user click the edit option to update the user record
    And The user validate that edit user screen is displayed
    And The user update profile by changing customer
    And The user update profile by changing role <newUserRole>
    And The user click the save button to save updates
    Examples:
      | firstName | lastName | userName | password | userRole | emailAddress     | cellPhoneNumber | newUserRole |
      | Tman      | Mbutho   | tman     | 123456   | Admin    | thanda@gmail.com | 086 001 0111    | Customer    |