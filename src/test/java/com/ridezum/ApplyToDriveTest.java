package com.ridezum;
import com.ridezum.page.DriverPage;
import com.ridezum.page.HomePage;
import org.junit.Test;

public class ApplyToDriveTest extends BaseTest {

    private HomePage homePage;
    private DriverPage driverPage;

    @Test
    public void testApplyToDrive() throws InterruptedException {

        homePage = new HomePage(driver);
        Thread.sleep(3000);
        driverPage = homePage.clickApplyToDriveButton();


    }

}
