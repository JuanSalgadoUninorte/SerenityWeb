#Author: Juan Salgado
  #language: en
Feature: Open Cart Online Store
  As a user I want to place an order through the OpenCart website.

  @OpenCartFromScratch
  Scenario Outline: Search for the items
    Given Than Juan wants to place an order for some items
    When He adds the items to the cart and places the order with his info
      | deviceName1   | deviceName2   | firstName   | lastName   | email   | phone   | password   | address1   | city   | postCode   | country   | regionState   | comment   |
      | <deviceName1> | <deviceName2> | <firstName> | <lastName> | <email> | <phone> | <password> | <address1> | <city> | <postCode> | <country> | <regionState> | <comment> |
    Then He confirms that the order is already placed
      | successMessage2   |
      | <successMessage2> |
    Examples:
      | deviceName1             | deviceName2 | firstName    | lastName | email                | phone     | password  | address1           | city   | postCode | country  | regionState | comment                            | successMessage2             |
      | Samsung Galaxy Tab 10.1 | iMac        | Camilo Clark | Zapata   | 52781125656@yopmail.com | 123456789 | 123456789 | Calle 100 #100-124 | Bogotá | 528954   | Colombia | Bogota D.C. | Please send the elements carefully | Your order has been placed! |

  @OpenCartWithAnAccount
  Scenario Outline: Search for the items
    Given Than Juan wants to place with his account and he is logged in
    When He adds the items to the cart and places the order
      | deviceName1   | deviceName2   | firstName   | lastName   | email   | password   | comment   |
      | <deviceName1> | <deviceName2> | <firstName> | <lastName> | <email> | <password> | <comment> |
    Then He logged in confirms that the order is already placed
      | successMessage3   |
      | <successMessage3> |
    Examples:
      | deviceName1             | deviceName2 | firstName | lastName | email                 | password  | comment                            | successMessage3             |
      | Samsung Galaxy Tab 10.1 | iMac        | Camilo    | Zapata   | pdgLp55o2@yopmail.com | 123456789 | Please send the elements carefully | Your order has been placed! |
      | Samsung Galaxy Tab 10.1 | iMac        | Camilo    | Zapata   | pdgLp55o2@yopmail.com | 123456789 | Please send the elements carefully | Your order has been placed! |

  @CreateAnAccountOK
  Scenario Outline: Search for the items
    Given Than Juan wants to create his account
    When He adds the right info in the form
      | firstName   | lastName   | email   | phone   | password   |
      | <firstName> | <lastName> | <email> | <phone> | <password> |
    Then The system has successfully created the account
      | successMessage   |
      | <successMessage> |
    Examples:
      | firstName     | lastName | email             | phone     | password  | successMessage |
      | Camilo Andrés | Zapata   | 33199@yopmail.com | 123456789 | 123456789 | Account        |
      | Camilo Andrés | Zapata   | 11199@yopmail.com | 123456789 | 123456789 | Account        |
      | Camilo Andrés | Zapata   | 12919@yopmail.com | 123456789 | 123456789 | Account        |
      | Camilo Andrés | Zapata   | 11399@yopmail.com | 123456789 | 123456789 | Account        |

  @CreateAnAccountWithFailures
  Scenario Outline: Create an account with failures
    Given Than Juan wants create his account
    When He add the wrong info
      | firstName   | lastName   | email   | phone   | password   |
      | <firstName> | <lastName> | <email> | <phone> | <password> |
    Then The system doesnt let him proceed
      | errorMessage   |
      | <errorMessage> |
    Examples:
      | firstName | lastName | email   | phone | password | errorMessage          |
      | -         | -        | a@a.com | -     | -        | Your Personal Details |
