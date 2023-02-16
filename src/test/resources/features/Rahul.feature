Feature:

  @iOS @home
  Scenario Outline: Verify login
    Then I login with "<username>" and "<password>"
    Examples:
      |username | password|
      | joe     | ml@123  |
      | siva    | ml@123  |
