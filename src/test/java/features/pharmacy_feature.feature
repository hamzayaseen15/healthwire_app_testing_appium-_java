Feature: Pharmacy

  Scenario: Order Medicine
    Given I click on order medicine button
    And I add the address on google map
    When I select the categories
    And I click on search bar
    And I Select two medicines from the search
    And I Navigate back and click on view cart
    And I verify the calculation on cart page
    And I click on proceed to checkout button
    And I select the address and scroll to the medicine information section
    And I verify the medicine calculation
    When I click on order now button to place order
