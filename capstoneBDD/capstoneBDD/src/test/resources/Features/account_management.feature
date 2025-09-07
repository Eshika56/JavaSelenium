Feature: User Account Management

#@regression
#Scenario: User registration
    #Given I am on the Demoblaze homepage
    #When I click on "Sign up"
    #And I register with username "eshikaBose" and password "eshikaB@34"
    #Then I should see an alert "This user already exist."

#@sanity
#Scenario: User login
    #Given I am on the Demoblaze homepage
    #When I click on the "Log in"
    #And I login with username "eshikaBose" and password "eshikaB@34"
    #Then I should see a welcome message with username "eshikaBose"

#@sanity
#Scenario: Profile cannot be changed directly (site lacks profile)
    #Given I am logged in as "eshikaBose"
    #Then there is no profile management functionality
