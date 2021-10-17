Feature: google search for suggested terms

Scenario Outline: suggested terms google search

Given I am on the google homepage
When I enter search "<term>"
And I select the first suggested search item
Then I see relevent search results
When I click on the first search results link
Then I land on the site result page

Examples:
|term             |
|Quality Assurance|
|Software         |