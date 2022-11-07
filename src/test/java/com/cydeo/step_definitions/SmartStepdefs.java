package com.cydeo.step_definitions;

import com.cydeo.pages.SmartPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartStepdefs {
    SmartPage smartPage = new SmartPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartPage.loginSmart();
        smartPage.order.click();
    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {}
    @When("User selects {string} from product dropdown")
    public void user_selects_family_album_from_product_dropdown(String string) {
        Select product = new Select(smartPage.product);
        product.selectByValue(string);
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartPage.quantity.sendKeys(string);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_john_wick_to_costumer_name(String string) {
        smartPage.customerName.sendKeys(string);
    }
    @When("User enters {string} to street")
    public void user_enters_kinzie_ave_to_street(String string) {
        smartPage.street.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_chicago_to_city(String string) {
        smartPage.city.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_il_to_state(String string) {
        smartPage.state.sendKeys(string);
    }
    @When("User enters {string}")
    public void user_enters(String string) {
        smartPage.zipCode.sendKeys(string);
    }

    @When("User selects {string} as card type")
    public void user_selects_visa_as_card_type(String string) {
        for (WebElement each : smartPage.cardType) {
            if(each.getAttribute("value").equals(string)){
                each.click();
            }
        }
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
       smartPage.cardNumber.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartPage.expDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartPage.process.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_john_wick_is_in_the_list(String string) {
        smartPage.viewAllOrders.click();
        Assert.assertTrue(smartPage.johnWick.isDisplayed());

    }



}