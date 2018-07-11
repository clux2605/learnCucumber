Feature: Login
  This test is for the login page

  Background:
    Given That I navigate to giftrete.com
    And I click on login

    @valid
  Scenario: Valid Login
    And I entered the username
    And I entered the password
    And I click on the login button
    Then I should login

      @invalid
  Scenario: Invalid Login Username
    And I entered the invalid username
    And I entered the password
    And I click on the login button
    Then I should not be able to login

      @invalid
  Scenario: Invalid Password Login
    And I entered the username
    And I entered the invalid password
    And I click on the login button
    Then I should not be able to login

        @valid
  Scenario: Valid Login with parameters
    And I entered the username "seunuser"
    And I entered the password "seunpassword"
    And I click on the login button
    Then I should login

          @invalid
  Scenario: Invalid Login with parameters
    And I entered the username "xxxxseunuser"
    And I entered the password "seunpassword"
    And I click on the login button
    Then I should not be able to login


            @valid
    Scenario Outline: Login with multiple users
      And I entered the username "<username>"
      And I entered the password "<password>"
      And I click on the login button
      Then I should login
      And I logout

      Examples:
      |username|password|
      |seunuser|seunpassword|
      |seunuser1|seunpassword|