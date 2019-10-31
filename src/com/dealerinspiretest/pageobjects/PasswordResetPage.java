package com.dealerinspiretest.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class PasswordResetPage
{
    protected WebDriver Driver;

    public PasswordResetPage(WebDriver driver)
    {
        Driver = driver;
    }

    public void resetPassword(String userName)
    {
        WebElement userNameField = Driver.findElement(By.cssSelector("div div div div:nth-child(2) form div:nth-child(1) input"));
        WebElement resetPasswordButton = Driver.findElement(By.tagName("button"));
        userNameField.sendKeys(userName);
        resetPasswordButton.click();
    }

    public String getErrorMessage()
    {
        WebElement errorMessage = Driver.findElement(By.className("auth-errors"));
        return errorMessage.getText();
    }

    public String getErrorMessageColor()
    {
        WebElement errorMessage = Driver.findElement(By.className("auth-errors"));
        return errorMessage.getCssValue("color");
    }

}
