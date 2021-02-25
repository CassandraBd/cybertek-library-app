Feature: As a librarian, I should be able to see book records on user page

  Background: User is already in login page
    Given user is on the login page

    @records
  Scenario: verify default values in Users page
    When Librarian enter "<librarianEmail>" and "<Password>"
    When Librarians click on UserTitle  link
    Then show records default value should be 10
    And show record should have following options:

      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |