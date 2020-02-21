Feature: Hoh stays in OPS Staging

  @staging

  Scenario Outline: HOH Stays displayed for <city>
    Given Login to OPS Staging is successful
    When I select a <city>
    And HOH STAYS page opened
    And Search options expanded
    And I select check in as current date
    And I clear checkin dates by field
    And I select Booking Status as Confirmed
    And I click search
    Then <city> hoh stays are displayed
    And Check console errors

    Examples: 
      | city      |
      | Bangkok   |
      | Barcelona |
      | Cannes    |
      | Florence  |
      | Lisbon    |
      | London    |
      | Madrid    |
      | Paris     |
      | Rome      |
