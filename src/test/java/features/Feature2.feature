Feature: Login

Background:
Given print something

@Regression
Scenario Outline: Validate log in with multiple set of data
Given Open browser with URL
When Enter the username <username>
When Enter the password <Password>
Then Clcik on Log in button
And Close the Browser


Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|standard_user|secret_sauce|