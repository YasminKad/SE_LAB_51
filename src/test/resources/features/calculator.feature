@tag
Feature: Calculator

  Scenario: calculate square root of a divided by b
    Given Two input values, 4 and 1
    When I calculate the square root of a divided by b
    Then I expect the return 2

  Scenario Outline: calculate square root of a divided by b
    Given Two input values, <a> and <b>
    When I calculate the square root of a divided by b
    Then I expect the return <result>

    Examples:
      | a | b | result |
      | 4 | 1 | 2      |
      | 9 | 3 | 1      |
      | 16 | 2 | 2     |
      | 25 | 5 | 2     |
      | 1 | 0 | -1  |

