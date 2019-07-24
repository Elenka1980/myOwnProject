package com.ridezum;

import com.ridezum.page.DriverPage;
import com.ridezum.page.HomePage;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class ApplyNowFieldsTest extends BaseTest{

    private HomePage homePage;
    private DriverPage driverPage;

    @Test
    public void testApplyNowFields() throws InterruptedException {

    homePage = new HomePage(driver);
    driverPage = homePage.clickApplyToDriveButton();

   driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

   driverPage.inputFirstName("Alina");
   driverPage.inputLastName("Dorina");
   driverPage.inputEmailField("Super16@gmail.com");
   driverPage.inputPhoneNumber("23657634654");
   /*
   driverPage.inputRegion("Califoniy");
   driverPage.inputZipCod("95608");
   driverPage.inputRefCod("0976");


    */
    /*
    Random random = new Random();
    int randomNumber = random.nextInt(6);


 /*



     */
    }

}
