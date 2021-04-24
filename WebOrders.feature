Feature: Test Web Orders
  Scenario: Test login verify user can login with correct credentials
    Given User will navigate to the website
    When User will enter valid username and valid password
    Then User will click login
    Then User should be able to login successfully



  Scenario: Test login verify user cannot login with incorrect passwords
    Given User will navigate to the website
    When User will enter valid username and invalid password
    Then User  click login
    Then User should be able to login unsuccessfully