package org.example.out.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by nikita on 01.09.17.
 */
public class LoginPage {

    @FindBy(id = "login")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passField;

    @FindBy(id = "rememberMe")
    private WebElement rememberMe;


    @FindBy(id = "loginBtn")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {

    }

    public void fillLogin(String login) {
    }

    public void fillPassword(String password) {
    }

    public void clickLoginBtn() {
    }

    public void enableRememberMe() {
    }
}
