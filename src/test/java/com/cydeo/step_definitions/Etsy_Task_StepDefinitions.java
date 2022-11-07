package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Etsy_Task_StepDefinitions {
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("user is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com ");
    }
    @Then("user sees title as expected")
    public void user_sees_title_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals("Title verification failed",expectedTitle,Driver.getDriver().getTitle());
    }
    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();
    }
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden spoon";
        Assert.assertTrue("Title verification failed",Driver.getDriver().getTitle().contains(expectedTitle));
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String searchkeyword) {
        etsySearchPage.searchBox.sendKeys(searchkeyword);
    }

    @Then("user sees {string} is in the title")
    public void userSeesInTheTitle(String expectedTitle) {
        Assert.assertTrue((Driver.getDriver().getTitle().contains(expectedTitle)));
    }
}
