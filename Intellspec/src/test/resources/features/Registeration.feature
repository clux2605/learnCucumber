Feature: Registration
  User registration page

  Scenario: Customer registration
    Given I navigate to giftrete.com
    When I click on registration
    And I entered the first name
    And I entered the last name
    And i entered the email address
    And I entered the password
    And I confirm the password
    And I click on the captcha checkbox
    And I click the signup button
    Then The user should be created