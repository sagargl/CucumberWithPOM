Feature: Amazon Dashboard Page
In order to Test Dashoard page
As a End user
I want to validate the home page dashboard icons 
  
    Scenario: Amazon Dashboard Page
    Given User is on Amazon Dashboard Page
    Then Validate the BestSellers Is present
    Then Validate the Mobiles Is present
    Then Validate the Fashion Is present
    Then Validate the Electronics Is present
    And Validate the NewReleases Is present
    
    
  