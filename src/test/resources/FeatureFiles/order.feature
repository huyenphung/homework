Feature: Order scenario

  @order @1
  Scenario: Verify the customer able to order TShirt
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select "Blue" color
    And click on Add to card
    And app shows "Faded Short Sleeve T-shirts" on checkout popup
    And click on Proceed to checkout
    Then Verify information of product is
      | ProductNumber |                      2 |
      | otherInfor    | Color : Blue, Size : S |
      | TotalPrice    | $35.02                 |

  @order @2
  Scenario: Verify the customer able to order 1 more TShirt from shopping card screen
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select "Blue" color
    And click on Add to card
    And app shows "Faded Short Sleeve T-shirts" on checkout popup
    And click on Proceed to checkout
    Then Verify information of product is
      | ProductNumber |                      2 |
      | otherInfor    | Color : Blue, Size : S |
      | TotalPrice    | $35.02                 |
    And Buy one more product
    Then Verify information of product is
      | ProductNumber |                      3 |
      | otherInfor    | Color : Blue, Size : S |
      | TotalPrice    | $51.53                 |

  @order @3
  Scenario: Verify the customer able to order TShirt and remove the ordered products
    Given I launch the page
    When i hover on Women
    And i select T-shirt
    And i can see list of T-shirt page
    And click on a product
    And buy "2" T-shirt
    And select "Blue" color
    And click on Add to card
    And app shows "Faded Short Sleeve T-shirts" on checkout popup
    And click on Proceed to checkout
    Then Verify information of product is
      | ProductNumber |                      2 |
      | otherInfor    | Color : Blue, Size : S |
      | TotalPrice    | $35.02                 |
    And minus one production
    Then Verify information of product is
      | ProductNumber |                      3 |
      | otherInfor    | Color : Blue, Size : S |
      | TotalPrice    | $18.51                 |

  @order @4
  Scenario: Verify the customer able to order TShirt and remove the ordered products
  Given I launch the page
  When i click on Women
  And i can see list of women's product category is "WOMEN"
  Then i select "Faded Short Sleeve T-shirts" 
  And Add to cart button
  And Continue to shopping
  And i hover on Cart list
  Then i can see all of are corrected
  |item1 |Faded Short Sleeve T-shirts|
  |item2|Blouse|
  |item3|Printed Dress|
