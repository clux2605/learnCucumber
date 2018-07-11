Feature: Creating the Wishlist
  Create a wishlist

  Background:
    Given That I navigate to giftrete\.com
    When I click on login
    And  I click on wishlist


    Scenario: Create Wishlist

      And select myself
      And fill in the form
      When I click on save
      Then a wishlist should be created for me

  Scenario: Create wishlist for a friend
    And select a friend
    And fill in the form
    When I click on save
    Then a wishlist should be created for a friend
