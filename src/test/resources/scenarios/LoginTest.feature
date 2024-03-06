
Feature: User Login
  User should be able to get logged on the login page

Background: I am on the main page of the website
  Given Open website "https://www.saucedemo.com/"


  Scenario Outline: Login on the page with valid credentials
    Given I am on login page
    When I enter <username> and <password>
    And I click on submit button
    Then I get on Products page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |