@Setup_Test_Data
Feature: Setup test data for mobile tests

  Background: 
    Given API token is present

  @Create_HoH_Stay
  Scenario Outline: Create an hoh stay and assign user to HK and WW service
    When I send a "POST" request with <property_id>, <checkin_time>, <checkout_time> and <channel>
    Then I get expected response code "201"
     And I capture the hoh stay id of <id>
     And I assign <hk_user> and <ww_user> to services of <id>
     #And I assign <key_code> to booking <id>

    Examples: 
      | property_id | checkin_time     | checkout_time    | channel                   | hk_user | ww_user | id |
      | 130         | 2019-12-06 15:00 | 2019-12-09 11:00 | hostmaker_direct_bookings | 2820    | 2819    | 0  |
      | 130         | 2019-12-09 15:00 | 2019-12-12 11:00 | morning_croissant         | 2820    | 2819    | 1  |
