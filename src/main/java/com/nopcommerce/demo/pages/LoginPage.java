package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Jay
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;

    @FindBy(xpath = "//div[@class='topic-block-title']//h2")
    WebElement welcomeToStoreText;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + password + " to password field : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
        log.info("Clicking on login button : " + loginBtn.toString());
    }

    public String getWelcomeText() {
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String getWelcomeToStore(){
        log.info("Getting welcome to store text : " + welcomeToStoreText.toString());
        return getTextFromElement(welcomeToStoreText);
    }

    public String getErrorMessage(){
        log.info("Getting error message : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
