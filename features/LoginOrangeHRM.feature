

Feature: OrangeHRM Login

Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And close browser

 

    Examples:

      |uname|pwd|

      |Admin | admin123 |
    
  #@tag1
  #Scenario: Logo presence on OrangeHRM home page
    #Given I launch chrome browser
    #When I open orange hrm homepage
    #Then I verify that the logo present on page
    #And close browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      #| name  |     value        | status  |
      #| Admin |     admin123     | success |
      