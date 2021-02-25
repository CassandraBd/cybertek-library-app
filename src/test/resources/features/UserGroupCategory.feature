Feature:  User group category features

  Background: User is already in login page
    Given user is on the login page

  @group
  Scenario: verify user categories
    Given user is on the login page
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    And the user click User Group dropdown
    Then the user should see the following options:
      | ALL       |
      | Librarian |
      | Students  |



