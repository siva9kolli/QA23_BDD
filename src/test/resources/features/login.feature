Feature: Login

  @login
  Scenario Outline: Verify positive login
    Given User on welcome screen
    Then User enter username "<username>" and password "<password>" and sumbit login form
    And User verify Home screen

    Examples:
    |username     | password    |
    |standard_user| secret_sauce|
