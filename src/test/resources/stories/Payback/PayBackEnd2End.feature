Feature: Payback E2E Execution 


Scenario: User is able to activate the card
Given user logins into payback application
Given user clicks on coupons
And user clicks on filter option
And user selects required partner
And user click on activation
Then verify user activation is successful "Vor Ort einlösen"