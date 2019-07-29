package com.ridezum.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> applyButton;


    public ApplyForThisJobPage clickApplyButton() {
        applyButton.get(0).click();
        return new ApplyForThisJobPage(driver);
    }

}
