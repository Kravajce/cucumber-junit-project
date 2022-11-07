package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US6_Step_Defs {


    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        System.out.println("start");
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        System.out.println("click the module");


    }
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        System.out.println("user will click");
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        System.out.println("user will choose");
    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        System.out.println("user will click sub module");
    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        System.out.println("verify");
    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        System.out.println("user clicks add icon on the top");
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {
        System.out.println("user will upload");
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        System.out.println("verify display");
    }


}

