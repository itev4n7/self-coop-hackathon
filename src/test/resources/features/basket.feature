Feature: Add product to basket

  Background:
    Given I go to main website 'https://apparel-uk.local:9002/ucstorefront/en'

  @smoke
  @addToBasket
  Scenario: Add product to basket
    Given I open category product page
    When I add product to the basket
    Then I see selected product is shown in the basket page