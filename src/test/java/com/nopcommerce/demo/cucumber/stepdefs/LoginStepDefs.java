package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Jay
 */
public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }


    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In", new LoginPage().getWelcomeText());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("Welcome to our store", new LoginPage().getWelcomeToStore());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String message) {
        Assert.assertEquals(message, new LoginPage().getErrorMessage());
//        Assert.assertTrue(new LoginPage().getErrorMessage().contains(message));
    }
}
