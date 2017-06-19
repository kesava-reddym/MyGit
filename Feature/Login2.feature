#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login1
Feature: Test Facebook smoke scenario

  Scenario Outline: Test Login with Valid Credentials
    Given Open firefox and start application
    When I enter valid "<uname>" and "<pwd>"
    Then User should be able to login Successfully
    Then application should be closed

    Examples: 
      | uname      | pwd      |
      | 8754647423 | sachinrt |
      | 8754647423 | absch    |