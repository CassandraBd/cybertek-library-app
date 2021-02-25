Feature: User management table feature


  Background: User is already in login page
    Given user is on the login page


    @management
  Scenario: user management table columns names

    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    Then the user should  see the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |