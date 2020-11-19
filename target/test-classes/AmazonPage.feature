@amazon
Feature: Automate Amazon Page

  Scenario: Validate that user is able to add item to cart
    Given User navigates to "https://www.amazon.com/"
    When Searches for the "Alexa"
    And Scroll down to the second page
    And Select the third item
    And Add item to cart
    Then Item is in a cart
    And  Item details displayed




