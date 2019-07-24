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

    public DriverPage clickApplyToDriveButton() {
        applyToDriveButton.get(1).click();
        return new DriverPage(driver);
    }

}
