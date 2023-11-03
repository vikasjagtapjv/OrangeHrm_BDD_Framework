
Feature: Admin

  Scenario: Title of your scenario
    Given Launch the Browser
    When Open the Url
    And Enters the UserName as "admin21" and enters the Password as "Admin321"
    And Click on login
    Then Page title should be "OrangeHRM"
    When I click on Admin
    Then Url must be "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
    And search user 
    And I enters the username,User role,Employee name,status
    And I click on search
    Then Info message should be visible
    When I click on Add 
    Then add user page should be open
    And I enters the user details 
    And close the browser

  
