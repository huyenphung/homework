Feature: Registration functionality scenario

  @order @1
  Scenario: Verify whether the User is able to register into the Application by providing all the fields
  
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select blue color
    And click on Add to card
    Then app shows the order information
    
   
