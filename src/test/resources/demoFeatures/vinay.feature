Feature: Home Module

  @smoke @home
  Scenario: Verify welcome page
    Given User open application
    When User on welcome screen
    Then User verify welcome screen