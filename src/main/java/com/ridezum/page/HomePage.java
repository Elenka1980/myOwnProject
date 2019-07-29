package com.ridezum.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.front-banner__btn")
    private List<WebElement>applyToDriveButton;

    @FindBy(css = ".main-menu__link")
    private List<WebElement>careersButton;



    public DriverPage clickApplyToDriveButton() {
        applyToDriveButton.get(1).click();
        return new DriverPage(driver);
    }
    public ViewJobsPage clickCareersButton() {
        careersButton.get(4).click();
        return new ViewJobsPage(driver);
    }


}
