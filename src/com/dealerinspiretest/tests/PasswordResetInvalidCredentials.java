package com.dealerinspiretest.tests;

import com.dealerinspiretest.pageobjects.LoginPage;
import com.dealerinspiretest.pageobjects.PasswordResetPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class PasswordResetInvalidCredentials {

    public static WebDriver driver=null;

    @Before
    public void setup() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://conversations.dealerinspire.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testPasswordResetInvalidCredentials()
    {
        LoginPage loginPage = new LoginPage(driver);
        PasswordResetPage passwordResetPage = loginPage.goToPasswordResetPage();
        passwordResetPage.resetPassword("john.tester@tester.com");

        assert passwordResetPage.getErrorMessage().contains("We can't find a user with that username.");
        assert passwordResetPage.getErrorMessageColor().contains("rgba(169, 68, 66, 1)");
    }

    @After
    public void teardown()
    {
        driver.close();
    }

}
