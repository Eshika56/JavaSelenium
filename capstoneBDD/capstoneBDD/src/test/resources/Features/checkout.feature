Feature: Checkout Process
 
@regression
Scenario: Complete checkout with valid details
    Given I have added "Samsung galaxy s6" to my cart
    When I proceed to cart and place order
    And I fill order form with name "Eshika Bose", country "India", city "Kolkata", credit card "1234567890", month "12", year "2025"
    And I confirm purchase
    Then I should see a confirmation dialog with purchase details