Feature: Registration already register user

  Background:
    Given I go to website 'https://apparel-uk.local:9002/ucstorefront/en'

  @registration
  Scenario: Register already registered user
    Given I go to register page
    When I fill all required fields
      | first name | last name | email                 | password    | repeat password |
      | Anna       | V         | ririannivel@gmail.com | ririannivel | ririannivel     |
    Then I see that I do not register to the website



