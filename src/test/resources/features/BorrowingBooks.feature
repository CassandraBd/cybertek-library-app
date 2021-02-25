Feature: 8. As a user, I should able to see my borrowing books.

  Background: User is already in login page
    Given user is on the login page


  @borrowing
  Scenario Outline: borrowing books table columns names
    When user enter "<userEmail>" and "<Password>"
    When the user click Borrowing Books module
    Then the user should see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |
    Examples:
      | userEmail | Password |
      | student104@library | 73ndoZd0 |
