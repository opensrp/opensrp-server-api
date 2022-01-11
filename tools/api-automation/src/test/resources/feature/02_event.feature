

Feature: event

  @test @client
  Scenario: Create New Client
    Given I am Testing Case : "115"
    And I Set POST Client service api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a POST HTTP request
    Then I receive valid Response for POST Client service

  @test @client
  Scenario: Update Client
    Given I am Testing Case : "115"
    And I Set Put Client service api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a PUT HTTP request
    Then I receive valid Response for Put Client service


  @test @event
  Scenario: Create New Event
    Given I am Testing Case : "115"
    And I Set POST event service api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a POST HTTP request
    Then I receive valid Response for POST event service


  @test @event
  Scenario: Update Event
    Given I am Testing Case : "115"
    And I Set Put event service api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a PUT HTTP request
    Then I receive valid Response for Put event service


