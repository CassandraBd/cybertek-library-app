Feature: User status feature

  Background: User is already in login page
    Given user is on the login page

    @status
  Scenario: verify user status
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    And the user  can click Status dropdown
    Then the user should see the following options:

      | ACTIVE   |
      | INACTIVE |



