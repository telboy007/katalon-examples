Feature: OPS Staging Page validations

  Background: Log in to OPS Staging
    Given Login to OPS Staging is successful

  Scenario: All cities are displayed in top bar selection
    Given London city is displayed by default
    When I click on top bar city dropdown
    Then All cities are displayed
    And Check console errors

  Scenario: I can navigate to HOH Stay page
    Given Home page is displayed
    When I click HOH Stays
    Then HOH STAYS page displayed
    And Check console errors
