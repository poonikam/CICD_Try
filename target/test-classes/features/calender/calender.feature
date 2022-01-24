Feature:Test Calender functionality for MBRD

  @Regression
  Scenario: TESTID_001_FirstTest
    Given I launch the Calender
    When I perform GET call with given endpoint
    Then I get responce

  Scenario: SRA131_Calender_Check_Calender meeting is added
    Given I launch the Calender
    When I perform GET call with given endpoint

  Scenario: SRA131_Calender_Check_Calender meeting is added
    Given I launch the Calender
    When I perform GET call with given endpoint

  Scenario: SRA131_Calender_Check_Calender meeting is added
    Given I launch the Calender
    When I perform GET call with given endpoint
    Then I get responce

  Scenario: SRA131_Calender_Check_Calender meeting is added new
    Given I launch the Calender new CI
    When I perform GET call with given endpoint
    Then I get responce