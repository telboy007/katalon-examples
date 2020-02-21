Feature: Login to Pages

@testTag
@Login
Scenario: I can login to OPS Staging with gmail
		Given OPS Staging login page is opened
		And I open gmail login page
		When I enter gmail login
		Then OPS Staging page is loaded
		

