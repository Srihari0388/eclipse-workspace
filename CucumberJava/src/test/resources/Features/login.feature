Feature: Feature to test Login
Scenario: Check Login is working or not

Given user in login page
When user enter credentials
And click on Login 
Then user is navigated to home page