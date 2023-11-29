@Calculator
  Feature: Calculator
    Scenario: Calculate sqrt(a/b) with specific inputs
      Given Two input values, 4 and 1
      When I calculate sqrt(a/b)
      Then I expect the result 2.0

