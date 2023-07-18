feature: OrangeHRM Login

 

  Scenario Outline: Title of your scenario outline

    Given I want to write a step

    When I enter enter <us> and <pwd>

    Then Login Successfull

 

    Examples:

      | us             | pwd        |

      | Admin | admin123 |

 

 

  Scenario: Search hotel page

    Given select all the dropdowns in search hotel

    When click on search button

    Then validate user is able to search hotel

 

  Scenario: select the Hotel page

    Given select the Hotel page

    When click on the Radio button

    And click on the continue button

    #And  click on the Cancel button

    Then book hotel should be dispaly

 

  Scenario: Book the hotel page

    Given Enter the all the personal details and card details

    When click on Book now option

    Then User is able to see the Booking Confirmation option

 

  Scenario: Search Order ID

    Given click on the Book Itinerary

    When Search Enter Order ID

    And click on the Go button

    Then User should display the Or

has context menu