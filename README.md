# DealerInspireChallenge
Code Challenge for Dealer Inspire

##Gherkin Test Scenarios

Scenario: Login with invalid credentials
Given the user is on the login page
When the user logs in with invalid credentials
Then the "The username or password you entered is not correct." error should be displayed

Scenario: Reset password with invalid username
Given the user is on the password reset page
When the user resets the password with an invalid username
Then the "We can't find a user with that username." error should be displayed in red
