@test
Feature: Authentication


  @test
  Scenario: Get Security Authentication
    Given I am Testing Case : "115"
    Given I Set GET authentication api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET Authentication service


