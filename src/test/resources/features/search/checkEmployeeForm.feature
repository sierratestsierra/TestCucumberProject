Feature: View city from employee list

  Scenario: No employee is selected and no city is returned
    Given employee list home page
    When no employee is selected from the list
    And view selected data button is clicked
    Then view of selected data is empty


  Scenario: One employee is selected from the list then unselected
    Given employee list home page
    When one employee is selected from the list
      | FirstName | LastName | Title                 |
      | Andrew    | Fuller   | Vice President, Sales |
    And view selected data button is clicked
    Then view city of employee selected
      | FirstName | City   |
      | Andrew    | Tacoma |
    Then unselect employee from the list
      | FirstName | LastName | Title                 |
      | Andrew    | Fuller   | Vice President, Sales |
    And view selected data button is clicked
    Then view of selected data is empty


  Scenario: Search cities of all employees from the list
    Given employee list home page
    When select all employees
    And view selected data button is clicked
    Then view all cities of employees on selected data
      | FirstName | City     |
      | Andrew    | Tacoma   |
      | Nancy     | Seattle  |
      | Janet     | Kirkland |
      | Margaret  | Redmond  |
      | Steven    | London   |
      | Michael   | London   |
      | Robert    | London   |
      | Anne      | London   |
      | Laura     | Seattle  |