Feature: Payback coupons page

Scenario: verify required options on coupons page
Given user logins into payback application
Then verify filter option is visible 
And verify nicht aktiviert option is present and selected 
And verify aktiviert option is also present 