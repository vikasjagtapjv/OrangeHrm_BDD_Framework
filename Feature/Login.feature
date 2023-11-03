Feature: Login

  Scenario: Login With valid credential
    Given Launch the ChromeBrowser
    When Open the Url
    And Enters the UserName
    And Enters the Password
    And Click on login
    Then Page title should be "OrangeHRM"
    And close the browser

  Scenario: Login with invalid credentials
    Given Launch the ChromeBrowser
    When Open the Url
    And Enters the UserName as "admin21" and enters the Password as "Admin321"
    And Click on login
    Then Page title should be "OrangeHRM"
    And close the browser
