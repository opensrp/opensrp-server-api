@test
Feature: Sync


  @Sync
  Scenario: Get Event Sync by Location
    Given I am Testing Case : "115"
    Given I Set GET Event Sync by Location api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET Event Sync by Location service

  @Sync
  Scenario: Get Event Sync by Provider
    Given I am Testing Case : "115"
    Given I Set GET Event Sync by Provider api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET Event Sync by Provider service


  @Sync
  Scenario: Get Event Sync by Team
    Given I am Testing Case : "115"
    Given I Set GET Event Sync by Team api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET Event Sync by Team service

