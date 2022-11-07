

Feature: Etsy Title Verification
  User Story: Etsy Search Functionality Title Verification

  Background:
    Given user is on Etsy home page

    Scenario: Etsy home page title verification
      Then user sees title as expected

      Scenario:  Etsy search functionality title verification
        When user types Wooden Spoon in the search box
        And user clicks search button
        Then user sees Wooden Spoon is in the title

        Scenario: Etsy search functionality title verification
          When user types "Wooden Spoon" in the search box
          And user clicks search button
          Then user sees "Wooden spoon" is in the title