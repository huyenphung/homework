Feature: Order scenario

  @order @1
  Scenario: Verify the customer able to order TShirt
  
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select blue color
    And click on Add to card
    And app shows "Faded Short Sleeve T-shirts" on checkout popup
    And click on Proceed to checkout
    Then Verify information of product is "2" products
   

 @order @2
  Scenario: Verify the customer able to order 1 more TShirt from shopping card screen
  
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select blue color
    And click on Add to card
    And app shows "Faded Short Sleeve T-shirts" on checkout popup
    And click on Proceed to checkout
    Then Verify information of product is "2" products
    And Buy one more product
     Then Verify information of product is "3" products
     
     @order @3
  Scenario: Verify the customer able to order TShirt and remove the ordered products
  
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select blue color
    And click on Add to card
    And app shows "Faded Short Sleeve T-shirts" on checkout popup
    And click on Proceed to checkout
    Then Verify information of product is "2" products
  And verify the price of ordered products is "$35.02"
  And minus one production
  Then verify the total price of the product is "$18.51"