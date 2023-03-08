package com.frameksen.step_definitions;

import com.frameksen.pages.LoginPage;
import com.frameksen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    //login
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("url");
    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String string, String string2) {

    }
    @When("user click the login button“")
    public void user_click_the_login_button() {

    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

    }
}
