Feature: Home Module

  @smoke @home
  Scenario: Verify welcome page
    Given User open application
    When User on welcome screen

  @android @home
  Scenario: Verify successfull login
    Then I login with "joe" and "ml@123"

    @iOS @home
  Scenario Outline: Verify login
    Then I login with "<username>" and "<password>"
    Examples:
    |username | password|
    | joe     | ml@123  |
    | siva    | ml@123  |
    | siva    | ml@123  |
    | Kavya    | ml@123  |

      @regression @home
  Scenario: Verify login failed
    Given I entered my credentials
    |joe|ml@123|4167413284|
    Then I verify login failed



