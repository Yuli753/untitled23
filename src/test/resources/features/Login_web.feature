Feature: SauceDemo Login

  Scenario: Valid Login
    Given I open the login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should see the products page

  Scenario: Invalid Login
    Given I open the login page
    When I login with username "invalid_user" and password "wrong_pass"
    Then I should see an error message

  Scenario: Empty Username
    Given I open the login page
    When I login with username "" and password "secret_sauce"
    Then I should see an error message