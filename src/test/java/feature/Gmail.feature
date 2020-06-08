Feature: SignUp Functionality

Scenario Outline: Gmail Signup
    Given the account user is on the Gmail landing Page
    When user enters the mandatory fields"<FirstName>" and "<LastName>" "<EmailAddress>" "<password>" "<CNFpasswrd>"
    Then the user should be able to signup
    And Close the Browser

    Examples: 
      | FirstName | LastName | EmailAddress | password | CNFpasswrd |
      | Ashish    | Goyal    | ashish66373@gmail.com | Welcome@123 | Welcome@123 |
      | Ashu	  |	Goel 	 | ashiJFFJ66373@gmail.com | Welcome@123 | Welcome@123 |
      