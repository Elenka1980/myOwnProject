package com.ridezum.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewJobsPage extends BasePage {

    public ViewJobsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.m-banner__btn")
    private WebElement viewJobsBatton;

    public ApplyPage clickViewJobsButton() {
        viewJobsBatton.click();
        return new ApplyPage(driver);
    }
}

