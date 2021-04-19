Feature:
  Scenario: HY-Main-US01 Verifying Request Info Link in main page
    Given User navigates to "main" page
    When User clicks on "request" button
    Then User should navigate to "request" page


Scenario: HY-Main-US02 verifying Apply Now Link in main page
  Given User navigates to "main" page
  When User clicks on "apply" button
  Then User should navigate to "apply" page

  Scenario: HY-Main-US03 Verifying 365 Portal Link in main page
    Given User navigates to "main" page
    When User clicks on "portal" button
    And User will sign in with following information
    |username|password|
    Then User should navigate to "portal" page


    Scenario : HY-Main-US04 Verifying functionality of drop-down menus under logo in main page
      Given User navigates to "main" page
      When Users hover on "<menu>" title
      Then Color of "<menu>" title should change
      And "<menu>" title should be link






