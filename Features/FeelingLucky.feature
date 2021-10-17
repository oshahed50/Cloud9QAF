Feature: google search - Feeling Lucky

Scenario Outline: feeling lucky - google search

Given I am on the google homepage
When I enter search "<term>"
And I click on I am feeling lucky button
Then I land on the first result homepage

Examples:
|term             |
|Quality Assurance|
|Software         |