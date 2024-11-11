@tag
Feature: Open the Snapdeal browser and verify the tests

  @tag1
  Scenario: Add to the cart
    Given Launch the browser
    And navigate to the snapdeal url
    And click on the mens fashions and the sports shoes
    And Sort them by price low to high
    When clicked on the first product
    Then switch to next product window
    And Add to the cart
    And click on the search button
    When entered the mobile cover
    Then mobile covers should be opened
    And Sort them by price low to high
    When clicked on first product
    Then switch to next product window
    And Add to the cart
