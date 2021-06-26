package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on login link : " + registerLink.toString());
    }
}
