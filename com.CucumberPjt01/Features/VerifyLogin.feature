Feature: To Test the Login Functionality

Scenario: To test login functionality of the application

Given A User is on the website
When User types UserName
And Usertypes Password
And User clicks on the submit button
Then User must not be able to log in successfully and it must say "The email you’ve entered doesn’t match any account. Sign up for an account." (order=0)