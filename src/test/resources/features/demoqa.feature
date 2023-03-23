#Author: Juan Salgado
  #language:en
Feature: Test QA
  As a user of test QA I want to learn and know how to interact with diferent HTML elements

  @elements
  Scenario Outline: Proving elements
    Given Access to the page
    When I interact with the components
      | fullName   | email   | address   | permanentAddress   | personOne   | personTwo   | personThree   | age   | salary   | department   | firstName   | lastName   | secondDepartment   |
      | <fullName> | <email> | <address> | <permanentAddress> | <personOne> | <personTwo> | <personThree> | <age> | <salary> | <department> | <firstName> | <lastName> | <secondDepartment> |
    Then I had finished my work
      | lastMessage   |
      | <lastMessage> |
    Examples:
      | fullName    | email            | address           | permanentAddress    | personOne | personTwo | personThree | age | salary | department | firstName | lastName  | secondDepartment | lastMessage             |
      | Juan Jacobs | juan@yopmail.com | 20973 Mountain DR | 15900 Maddison BLVD | Vega      | Cantrell  | Gentry      | 45  | 10000  | Insurance  | Deborah   | Hamillton | Development      | Visible After 5 Seconds |

  @forms
  Scenario Outline: Trying with forms
    Given The page
    When All the components are tested
      | firstName   | lastName   | gender   | email   | phone   | year   | day   | month   | subject   | address   | city   | state   |
      | <firstName> | <lastName> | <gender> | <email> | <phone> | <year> | <day> | <month> | <subject> | <address> | <city> | <state> |
    Then I can go home
      | confirmationMessage   |
      | <confirmationMessage> |
    Examples:
      | firstName | lastName  | gender | email     | phone      | year | month | day | address           | city  | state | subject | confirmationMessage            |
      | Juan      | Dominicus | Male   | jjj@j.com | 1234567890 | 2003 | May   | 25  | 20973 Mountain DR | Delhi | NCR   | English | Thanks for submitting the form |

  @alertsFrame&Windows
  Scenario Outline: Figuring out how to use alerts, frames and windows
    Given The elements
    When I interact with those
      | promptMessage   |
      | <promptMessage> |
    Then All are done
      | message   |
      | <message> |
    Examples:
      | message | promptMessage |
      | Alerts  | 123           |

  @widgets
  Scenario Outline: Using widgets
    Given The web page
    When I access to the components
      | colorOne   | colorTwo   | singleColor   | month   | year   | day   | hour   | slider   | selectValue   | selectOne   | oldMenu   | multiColorOne   | multiColorTwo   | standard   |
      | <colorOne> | <colorTwo> | <singleColor> | <month> | <year> | <day> | <hour> | <slider> | <selectValue> | <selectOne> | <oldMenu> | <multiColorOne> | <multiColorTwo> | <standard> |
    Then We had finished
      | finished   |
      | <finished> |
    Examples:
      | colorOne | colorTwo | singleColor | month | year | day | hour  | slider | selectValue         | selectOne | oldMenu | multiColorOne | multiColorTwo | standard | finished |
      | Blue     | Black    | Yellow      | May   | 2000 | 25  | 16:15 | 65     | Another root option | Mr.       | Voilet  | Blue          | Green         | Volvo    | Slider   |

  @interactions
  Scenario Outline: Knowing how to interact with interactions
    Given The components
    When All are tried
    Then We are done
      | finished   |
      | <finished> |
    Examples:
      | finished     |
      | Cursor Style |

  @bookStoreApplication
  Scenario Outline: A real case, or something like that
    Given The interaction
    When The components are already tried
      | firstName   | lastName   | userName   | password   | bookOne   | bookTwo   |
      | <firstName> | <lastName> | <userName> | <password> | <bookOne> | <bookTwo> |
    Then Lets go home
    Examples:
      | firstName | lastName | userName   | password   | bookOne         | bookTwo |
      | Nicole    | Gerena   | NicoGerena1 | @Aa123456789 | Java Essencials | Git     |

