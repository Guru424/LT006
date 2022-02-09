Feature: Login to HRMS application

  Scenario Outline: Login with valid credentials
    Given Open the hrms application
    When Enter valid "<username>" and "<password>"
    Then Click on the login button
    
    Examples:
    |username|password|
    |admin|admin|
    |admin|admin|
    |Guru|Guru|
    
