@test
Feature: Search

  Scenario: Get Unique Id request
    Given I am Testing Case : "115"
    Given I Set GET Unique Id request api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET Unique Id request service


  Scenario: Search Client By Path
    Given I am Testing Case : "115"
    Given I Set Search Client By Path api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client By Path service



  Scenario: Search Client II
    Given I am Testing Case : "115"
    Given I Set Search Client II api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client II service

  Scenario: Search Client By Gender
    Given I am Testing Case : "115"
    Given I Set Search Client By Gender api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client By Gender  service

  Scenario: Fetch Client By Id
    Given I am Testing Case : "115"
    Given I Set Fetch Client By Id api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for SFetch Client By Id service

  Scenario: Search Client By Birthday
    Given I am Testing Case : "115"
    Given I Set Search Client By Birthday api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client By Birthday  service

  Scenario: Search Client By Name
    Given I am Testing Case : "115"
    Given I Set Search Client By Name api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Client By Name  service

  Scenario: Get All users
    Given I am Testing Case : "115"
    Given I Set GET all users api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET all users service
