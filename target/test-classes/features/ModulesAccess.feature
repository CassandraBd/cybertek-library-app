Feature: Student should be able to access modules


  Background: User is already in login page
    Given user is on the login page

  @module1
  Scenario Outline:  As a user, I should be able to  see several modules once I login.
    Given user is on the login page
    When user enter "<userEmail>" and "<Password>"
    Then the user should see following modules
      | Books           |
      | Borrowing Books |

    Examples: user login info
      | userEmail          | Password |
      | student102@library | Aaf6GwsY |
      | student103@library | 7zWoKREA |
      | student104@library | 73ndoZd0 |

@module2
  Scenario: Librarians  should have access to 3 modules
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then the user should see following modules
      | Dashboard |
      | Users     |
      | Books     |