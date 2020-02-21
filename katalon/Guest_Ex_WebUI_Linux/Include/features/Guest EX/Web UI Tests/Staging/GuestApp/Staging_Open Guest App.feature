Feature: Open Guest application from OPS Staging

  Background: Login to OPS Staging
    Given Login to OPS Staging is successful

  @meet&greet
  Scenario Outline: Check Meet&Greet Guest app for Check in State Booking Confirm Message Not Sent for <city>
    Given I select a <city>
    And HOH STAYS page opened
    And Search options expanded
    And I select check in as current date
    And I clear checkin dates by field
    When I select check in State as Booking Confirm Message Not Sent
    And I click search
    And <city> hoh stays are displayed
    And I click View for first HoHStay
    And HoH Stay details page is opened
    And I click GUEST CHECK-IN FORM staging link
    Then Guest app page display expired page
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

  @meet&greet
  Scenario Outline: Check Meet&Greet Guest app for Check in State Booking Confirm Message Sent for <city>
    Given I select a <city>
    And HOH STAYS page opened
    And Search options expanded
    And I select check in as current date
    And I clear checkin dates by field
    When I select check in State as Booking Confirm Message Sent
    And I select check in type as Meet & Greet
    And I click search
    And <city> hoh stays are displayed
    And I click View for first HoHStay
    And HoH Stay details page is opened
    And Meet&Greet is selected
    And I click GUEST CHECK-IN FORM staging link
    Then Guest app checkin <city> initial page opens
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
      
    @meet&greet
  Scenario Outline: Check Meet&Greet Guest app for Check in State Being Chased (Not Confirmed) for <city>
    Given I select a <city>
    And HOH STAYS page opened
    And Search options expanded
    And I select check in as current date
    And I clear checkin dates by field
    When I select check in State as Being Chased Not Confirmed
    And I select check in type as Meet & Greet
    And I click search
    And <city> hoh stays are displayed
    And I click View for first HoHStay
    And HoH Stay details page is opened
    And Meet&Greet is selected
    And I click GUEST CHECK-IN FORM staging link
    Then Guest app checkin <city> initial page opens
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
      
  @meet&greet
  Scenario Outline: Check Meet&Greet Guest app for Check in State Confirmed for <city>
    Given I select a <city>
    And HOH STAYS page opened
    And Search options expanded
    And I select check in as current date
    And I clear checkin dates by field
    When I select Check in State as Confirmed
    And I select check in type as Meet & Greet
    And I click search
    And <city> hoh stays are displayed
    And I click View for first HoHStay
    And HoH Stay details page is opened
    And Meet&Greet is selected
    And I click GUEST CHECK-IN FORM staging link
    Then Guest app checkin <city> confirmed page opened
    And drop-down sections can be viewed
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
          

