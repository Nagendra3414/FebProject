Feature: Log in functionality

@Regression @Sanity
Scenario: Validate log in with valid credentials
Given Open browser with URL
When Enter username
When Enter Password
Then Clcik on Log in button
And Close the Browser

@Sanity
Scenario: Validate log in with invalid credentials
Given Open browser with URL
When Enter username
When Enter Password
Then Clcik on Log in button
And Close the Browser

@Sanity
Scenario: Validate log in with invalid credentials
Given Open browser with URL
When Enter username
When Enter Password
Then Clcik on Log in button
And Close the Browser


@Smoke
Scenario: Validate log in with invalid credentials
Given Open browser with URL
When Enter username
When Enter Password
Then Clcik on Log in button
And Close the Browser


@Retest
Scenario: Validate log in with invalid credentials
Given Open browser with URL
When Enter username
When Enter Password
Then Clcik on Log in button
And Close the Browser
