package com.frameksen.step_definitions;

import com.frameksen.pages.BasePage;
import com.frameksen.pages.LoginPage;
import com.frameksen.utilities.BrowserUtils;
import com.frameksen.utilities.ConfigurationReader;
import com.frameksen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US07_StepDefs {
    LoginPage loginPage = new LoginPage();

    //scenario
/*
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get((ConfigurationReader.getProperty("url")));

       loginPage.login("user1","Userpass123");
        loginPage.submit.click();
        //loginPage.userName.sendKeys("user1" + Keys.ENTER);
    }

 */
        @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
            Driver.getDriver().get((ConfigurationReader.getProperty("url")));
            loginPage.login("user1","Userpass123");
            loginPage.submit.click();
            //Driver.getDriver().getTitle();
           // String expectedTitle ="Dashboard";
            BrowserUtils.verifyTitleContains("Dashboard");
           // Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
       //Driver.getDriver().get("url");

      // loginPage.login("userNameStr","passwordStr");
      // loginPage.submit.click();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {

    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {

    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }


}
