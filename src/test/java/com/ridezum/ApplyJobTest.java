package com.ridezum;

import com.ridezum.page.*;
import org.junit.Test;

public class ApplyJobTest extends BaseTest {

    private HomePage homePage;
    private DriverPage driverPage;
    private ViewJobsPage viewJobsPage;
    private ApplyPage applyPage;
    private ApplyForThisJobPage applyForThisJobPage;
    private SubmitYourApplicationPage submitYourApplicationPage;


    @Test
    public void testApplyJob() throws InterruptedException{

        homePage = new HomePage(driver);

       viewJobsPage = homePage.clickCareersButton();

       //remember window(tab) before switch
        String windowHandlBefore = driver.getWindowHandle();

        applyPage = viewJobsPage.clickViewJobsButton();

        //Switch to new window (tab)
        for(String winHandle: driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }

        applyForThisJobPage = applyPage.clickApplyButton();

        submitYourApplicationPage = applyForThisJobPage.clickApplyForThisJobButton();





































            //close curent window (tab)
            //driver.close();

            //Switch back
           // driver.switchTo().window(windowHandlBefore);



















    }
}
