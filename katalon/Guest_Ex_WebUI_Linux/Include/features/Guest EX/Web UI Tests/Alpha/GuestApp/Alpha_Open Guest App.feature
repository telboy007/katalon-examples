Feature: Open Guest application from OPS Alpha

@alpha
  Scenario: Open Guest app for London in Alpha
    Given Login to OPS Alpha is successful
    And All is displayed by default for cities
    And HOH STAYS page opened
    And Search options expanded
    When I clear checkin dates by field
    And I select check in as current date
    And I select Booking Status as Confirmed
    And I select Check in State as Confirmed
    And I click search
    And I click View for first HoHStay
    And HoH Stay details page is opened
    And I click GUEST CHECK-IN FORM alpha link
    Then Guest App is opened
    And Check console errors
