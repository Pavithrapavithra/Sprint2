Feature: Hotel Booking

Scenario: To find and book hotel.
Given User in on landing page
And User enters hotel name and selects the hotel name
And User enters check-in and checkout date
And User clicks rooms&guests , apply button and search button.
Then User gets List of hotels and clicks on specified Hotel
Then User gets selected hotel details
And User clicks on 'Book this combo'
Then User in on Review Booking page
And User selects title
And User enters fullname and lastname
And User enters email address and mobilenumber
And User clicks on 'PAYNOW' button
Then User gets Payment page with Payment options.


