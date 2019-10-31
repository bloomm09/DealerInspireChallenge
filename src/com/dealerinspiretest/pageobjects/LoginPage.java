package com.dealerinspiretest.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    protected WebDriver Driver;

    public LoginPage(WebDriver driver)
    {
        Driver = driver;
    }

    public void login(String userName, String password)
    {
        WebElement userNameField = Driver.findElement(By.cssSelector("div.login-wrapper div.left form div:nth-child(1) input"));
        WebElement passwordField = Driver.findElement(By.cssSelector("div.login-wrapper div.left form div:nth-child(2) input"));
        WebElement loginButton = Driver.findElement(By.tagName("button"));
        userNameField.sendKeys("test");
        passwordField.sendKeys("test");
        loginButton.click();
    }

    public String getErrorMessage()
    {
       WebElement errorMessage = Driver.findElement(By.className("auth-errors"));
       return errorMessage.getText();
    }

    public PasswordResetPage goToPasswordResetPage()
    {
        WebElement forgetButton = Driver.findElement(By.className("forgot-password"));
        forgetButton.click();
        return new PasswordResetPage(Driver);
    }
}
