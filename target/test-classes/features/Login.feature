Feature: Login feature

  @log
Scenario Outline: user login verification
Given user on login page
When user enter "<userEmail>" and  "<Password>"
Then user see  "<role>" and "<page>"
Then user Logout from homePage


Examples: user login and page on library
| userEmail           | Password | role      | page     |
| student102@library  | Aaf6GwsY | student   | Books    |
| student103@library  | 7zWoKREA | student   | Books    |
| student104@library  | 73ndoZd0 | student   | Books    |
| librarian14@library | 87x8afWY | librarian | Dashboard|

    @logout
    Scenario Outline: user login verification
      Given user on login page
      When user enter "<userEmail>" and  "<Password>"
      Then user Logout from homePage
      Then user on login page

      Examples: user login and page on library
        | userEmail           | Password | role      | page     |
        | student102@library  | Aaf6GwsY | student   | Books    |
        | student103@library  | 7zWoKREA | student   | Books    |
        | student104@library  | 73ndoZd0 | student   | Books    |
        | librarian14@library | 87x8afWY | librarian | Dashboard|