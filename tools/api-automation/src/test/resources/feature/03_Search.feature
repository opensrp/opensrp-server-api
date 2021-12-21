@test
Feature: Search


  @Sync
  Scenario: Get Unique Id request
    Given I am Testing Case : "115"
    Given I Set GET Unique Id request api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET Unique Id request service

  @Sync
  Scenario: Search Client By Path
    Given I am Testing Case : "115"
    Given I Set Search Client By Path api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client By Path service


  @Sync
  Scenario: Search Client II
    Given I am Testing Case : "115"
    Given I Set Search Client II api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client II service

