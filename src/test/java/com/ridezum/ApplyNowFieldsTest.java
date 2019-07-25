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
   driverPage.inputPhoneNumber("9164909515");
   /*
   driverPage.inputRegion("Californiy");

    */
   Random random = new Random();
   int randomSelectRegion = random.nextInt(6);
   driverPage.selectRegion(3);


   driverPage.inputZipCodeField("95608");
   driverPage.inputRefCodeField("0976");

   driver.switchTo().defaultContent();
   driver.switchTo().defaultContent();

   driverPage.clickSubmitButton(4);

    }

}
