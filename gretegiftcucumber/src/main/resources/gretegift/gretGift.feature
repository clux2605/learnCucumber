Feature: Test the Gretgift website for login

  Scenario: Login With Valid Username and Password
    Given Open browser and navigate to giftrete
    When I enter a valid username
    And I enter a valid password
    Then I should login successfully into the website


