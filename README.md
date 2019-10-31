# DealerInspireChallenge
Code Challenge for Dealer Inspire

## Gherkin Test Scenarios

**Scenario**: Login with invalid credentials  
**Given** the user is on the login page  
**When** the user logs in with invalid credentials  
**Then** the "The username or password you entered is not correct." error should be displayed  

**Scenario**: Reset password with invalid username  
**Given** the user is on the password reset page  
**When** the user resets the password with an invalid username  
**Then** the "We can't find a user with that username." error should be displayed in red  

## Test Run Demo  
https://youtu.be/qVP3L2GSkUs

## Additional Observations

While creating these two tests, I came across a scenario where entering an "a" into the username field, while resetting the password, would cause the system to believe a valid username had been entered and a message would be displayed saying that a password reset e-mail had been sent. I attempted this with other single characters and could not replicate the results with anything other than a single "a" character.
