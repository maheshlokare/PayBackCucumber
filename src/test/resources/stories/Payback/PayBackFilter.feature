Feature: Payback Filter Page

Scenario: verify required options on filter page
Given user logins into payback application
And user logins into payback application 
When user clicks on coupons
Then user clicks on filter
And verify nicht beliebteste partner mit coupons option is present
And verify partner mit coupons option is also present 

Scenario: verify required options on filter page
Given user logins into payback application
And user logins into payback application 
When user clicks on coupons
Then user clicks on filter
And verify nicht beliebteste partner mit coupons option is present
And verify partner mit coupons option is also present 

Scenario: verify without selecting any coupon clickin on fertig returns to coupon page
Given user logins into payback application
And user logins into payback application 
When user clicks on coupons
And user clicks on filter
And user clicks on fertig
Then user is returned to coupons page