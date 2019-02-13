Feature: Login Feature
  @login @smoke
  Scenario: Login testing
    When user logs in
    Then user passes credentials
    And user checks