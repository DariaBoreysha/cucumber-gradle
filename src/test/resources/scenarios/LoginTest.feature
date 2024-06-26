@SmokeTest
@debug1
Feature: User Login
  User should be able to get logged on the login page

Background: I am on the main page of the website
  Given Open website "https://www.demoblaze.com/"


  Scenario Outline: Login on the page with valid credentials
    Given I am on basic page of website
    When I click on Log in button
    And I enter <username> and <password>
    And I click on submit button
    And I am logged in with my <username>
    Then I log out

    Examples:
      | username | password |
      | 1        | 1        |
      | 2        | 2        |