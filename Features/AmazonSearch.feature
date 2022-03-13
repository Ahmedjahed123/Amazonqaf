@AmazonLogin
Feature: Login to amazon.com
I want to validate amazon login feature for valid and invalid credentials
Scenario Outline: Validate amazon login for invalid credentials

Given I am on amazon homepage
When I click on sign in button
And I enter "<email>" address and click continue
And I enter invalid "<password>" and click continue
Then I receive an error message 

Examples: 
| email                     | password   |  
| jfsayam19@gmail.com | Jfsayam19  |
        