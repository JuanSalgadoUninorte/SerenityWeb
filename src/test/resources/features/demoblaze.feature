#Author: Juan Salgado
  #language: en
Feature: DemoBlaze
  As a user of demo blaze I want to know more about it and place an order for some items

  @createAUser
  Scenario Outline: Juan creates a user
    Given Juan access to the webpage
    When He adds his credentials
      | userName   | password   |
      | <userName> | <password> |
    Then He is notified that the user is created
      | messageSuccessful   |
      | <messageSuccessful> |
    Examples:
      | userName          | password  | messageSuccessful   |
      | usuarioProbado124 | 123456789 | Sign up successful. |
      | usuarioProbado245 | 123456789 | Sign up successful. |

  @loggingInAndLogOut
  Scenario Outline: Juan logs in into the web page
    Given The access to the web page
    When I access the credentials and be logged in
      | userName   | password   |
      | <userName> | <password> |
    Then I can log out
      | userName   |
      | <userName> |
    Examples:
      | userName        | password  |
      | usuarioProbado  | 123456789 |
      | usuarioProbado2 | 123456789 |

  @loggingInError
  Scenario Outline: Juan access with the wrong info
    Given The access to the web page is given
    When I access some wrong credentials and be logged in
      | userName   | password   |
      | <userName> | <password> |
    Then I can see the error message
      | messageUnsuccessful   |
      | <messageUnsuccessful> |
    Examples:
      | userName    | password | messageUnsuccessful  |
      | usuariado   | 123489   | User does not exist. |
      | usuarobado2 | 123789   | User does not exist. |

  @makeAnOrder
  Scenario Outline: Juan places an order
    Given Access into the web page
    When The information of the items is added to the cart and the order is placed
      | name   | country   | city   | creditCard   | month   | year   |
      | <name> | <country> | <city> | <creditCard> | <month> | <year> |
    Then He confirms that the purchase is placed
      | confirmation   |
      | <confirmation> |
    Examples:
      | name   | country  | city     | creditCard       | month | year | confirmation |
      | Stella | Colombia | Medellín | 1234567895213654 | 12/26 | 2026 | OK           |

  @contactUs
  Scenario Outline: : Juan places a contact
    Given Juan is on the web page
    When He gives his information
      | contactEmail   | contactName   | message2   |
      | <contactEmail> | <contactName> | <message2> |
    Then He receives the message confirmation
      | confirmation2   |
      | <confirmation2> |
    Examples:
      | contactEmail   | contactName | message2 | confirmation2            |
      | usuarioProbado | Colombia    | Gracias! | Thanks for the message!! |
