package com.ridezum;

import com.ridezum.page.DriverPage;
import com.ridezum.page.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class VerificationTest extends BaseTest{

    private HomePage homePage;
    private DriverPage driverPage;

    @Test
    public void testVerification() {

        homePage = new HomePage(driver);

        driverPage = new DriverPage(driver) ;
        homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        driverPage.inputFirstName("Sabina");
        driverPage.inputLastName("Dorinova");
        driverPage.inputEmailField("Super777gmail.com");
        driverPage.inputPhoneNumber("qwerrtyu");


        /*String emailField = driverPage.getHelpBlock1Field();
        System.out.println(emailField);
        Assert.assertEquals("Please enter a valid email address");

         */
       driverPage.clearEmailField();
       driverPage.clearPhoneNumber();











    }



}

