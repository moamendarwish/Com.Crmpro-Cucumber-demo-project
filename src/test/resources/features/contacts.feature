Feature: Contacts

  @Regression
  Scenario: make sure email text field is visible
    Given user opens the website and goes to the login page
    When user enters valid credentials as "userName" and "test123!"
    And clicks on contacts
    Then email text field is visible

  @Regression
  Scenario: add new contact
    Given user opens the website and goes to the login page
    When user enters valid credentials as "userName" and "test123!"
    And clicks on contacts
    And clicks on add new contact
    And fills the firstName "userFirstName" and the lastName "userLastName" and click save
    Then new contact should be added
