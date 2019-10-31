package com.dealerinspiretest.tests;

import com.dealerinspiretest.pageobjects.LoginPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginInvalidCredentials{

    public static WebDriver driver=null;

    @Before
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://conversations.dealerinspire.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testLoginInvalidCredentials(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john.tester@tester.com", "testPassword");

        assert loginPage.getErrorMessage().contains("The username or password you entered is not correct.");
    }

    @After
    public void teardown(){

        driver.close();

    }

}