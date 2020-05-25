Feature: Application Login

Scenario: Login with Valid Credentials
Given the account user is on the Facebook landing Page
When the user enters valid credentials.
Then the user should be able to log in.
And Close the Browrser


Scenario: Login with InValid Credentials
Given the account user is on the Facebook landing Page
When the user enters Invalid credentials 
Then the user should not be able to log in.
