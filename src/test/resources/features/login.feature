Feature: login Feature

  @Sanity
  Scenario: login successful
    Given user opens the website and goes to the login page
    When user enters valid credentials as "userName" and "test123!"
    Then user should be taken to home page

  @Regression
  Scenario Outline: login with invalid credentials
    Given user opens the website and goes to the login page
    When user enters valid credentials as "<username>" and "<password>"
    Then error message should appear
    Examples:
      | username | password |
      | userName   | wrong    |
      | wrong    | password |
      | userName   | test123! |
