package com.metlife.StepDefintion;

import com.metlife.Utilities.WebdriverUtility;
import com.metlife.pageobjects.Loginpge;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class runner {

    @Given("Open browser and launch Salesforce scheduler")
    public void open_browser_and_launch_salesforce_scheduler() {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtility.initialize();
        WebdriverUtility.navigate("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter the {string} and {string}")
    public void enter_the_and(String string, String string2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        WebdriverUtility.type(Loginpge.username, string);
        WebdriverUtility.type(Loginpge.pwd,string2);
      //  throw new io.cucumber.java.PendingException();
    }

    @Then("Click on the login button")
    public void click_on_the_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtility.click(Loginpge.login_btn);
      // throw new io.cucumber.java.PendingException();
    }
}
