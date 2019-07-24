package com.ridezum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elena\\Desktop\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://ridezum.com/");

        System.out.println("Start");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle = "Zūm | Your school’s one-stop partner for safe & reliable student transportation";
        Assert.assertEquals(expectedTitle, actualTitle);

    }
    @After
    public void quit() {
        /*
        System.out.println("Finish");
        driver.quit();*/
    }





}
