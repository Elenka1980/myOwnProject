package com.ridezum;

import com.ridezum.page.*;
import org.junit.Assert;
import org.junit.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

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

        submitYourApplicationPage.inputName("Polina");
        submitYourApplicationPage.inputEmail("famaley@ukr.net");
        submitYourApplicationPage.inputPhone("9164993762");
        submitYourApplicationPage.inputCurrentCompany("Cleo");
        submitYourApplicationPage.inputLinkedln("www.linkedin.com/in/elena-shpak-225b19152");
        submitYourApplicationPage.selectGender(2);
        submitYourApplicationPage.selectRace(3);
        submitYourApplicationPage.selectVeteran(1);
        submitYourApplicationPage.clicksubmitApplicatinButton();

        String errorField = submitYourApplicationPage.selectErrorNote();
        System.out.println(errorField);
        Assert.assertEquals("✱ Please attach a resume", errorField);







































        //close curent window (tab)
            //driver.close();

            //Switch back
           // driver.switchTo().window(windowHandlBefore);



















    }
}
