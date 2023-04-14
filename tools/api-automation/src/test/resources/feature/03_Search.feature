@test @search
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

  Scenario: Get All Events
    Given I am Testing Case : "115"
    Given I Set GET all events api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET all events service

  Scenario: Get All stocks
    Given I am Testing Case : "115"
    Given I Set GET all stocks api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET all stocks service

  Scenario: Get stock by id
    Given I am Testing Case : "115"
    Given I Set GET stock by id api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for GET stock by id service

  Scenario: Search Event By team
    Given I am Testing Case : "115"
    Given I Set Search  Event By team api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By team service

  Scenario: Search Event By team id
    Given I am Testing Case : "115"
    Given I Set Search  Event By team id api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By team id service


  Scenario: Search Event By Location id
    Given I am Testing Case : "115"
    Given I Set Search  Event By Location id api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By Location id service

  Scenario: Search Event By Provider id
    Given I am Testing Case : "115"
    Given I Set Search  Event By Provider id api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By Provider id service


  Scenario: Search Event By Entity type
    Given I am Testing Case : "115"
    Given I Set Search  Event By Entity type api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By Entity type service

  Scenario: Search Event By Event type
    Given I am Testing Case : "115"
    Given I Set Search  Event By Event type api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By Event type service

  Scenario: Search Event By id
    Given I am Testing Case : "115"
    Given I Set Search  Event By id api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Search Event By id service


  Scenario: Fetch Provider action
    Given I am Testing Case : "115"
    Given I Set Fetch Provider action api service endpoint
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response for Fetch Provider action service
