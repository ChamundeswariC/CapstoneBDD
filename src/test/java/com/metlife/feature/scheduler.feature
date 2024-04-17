Feature: Validating Salesforce_Scheduler Classic

  Scenario Outline: : Validating Login functionality
    Given Open browser and launch the URL
    When Enter the <string> and <string2>
    Then Click on the login button
    Examples:
      | string                      | string2    |
      | "ghadgemangesh20@gmail.com" | "M@ng2359" |
