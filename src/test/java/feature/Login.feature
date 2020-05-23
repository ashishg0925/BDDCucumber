Feature: Application Login


Scenario: Home Page Login
Given User is on the landing page
When User logins into application with username and password
Then Home page is populated
And homepage is displayed



Scenario: Home Page Login
Given User is on the landing page
When User logins into application with username = "" and password = ""
Then Home page is populated
And homepage is displayed