@tag
Feature: Sauce Web application 
  Validate The User Login in Sauce Login

  @SauceLogin
  Scenario: Login in Saucelab Application
    Given I open the browser with URL "https://www.saucedemo.com/v1/"
    Then I should see the login page
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click login
    Then I should see see products
    And I close the Browser

