Feature: Login

  Background:
    Given I go to 'https://apparel-uk.local:9002/ucstorefront/en'

  Scenario: Login successfully
    Given I go to sing in page
    When I login with 'ririannivel@gmail.com' email and 'ririannivel' password
    Then I see that i logged in
