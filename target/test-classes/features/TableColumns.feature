Feature: As a students, I should be able to see tables with default info


  Background: User is already in login page
    Given user is on the login page

  @columns
  Scenario Outline: student should be able to see tables with default info
    Given user is on the login page
    When user enter "<userEmail>" and "<Password>"
    Then the user should see following names
      | Action and Adventure |
      | ISBN                 |
      | Name                 |
      | Author               |
      | Category             |
      | Year                 |
      | Borrowed By          |

    Examples:
      | userEmail          | Password |
      | student104@library | 73ndoZd0 |

