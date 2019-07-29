package com.ridezum.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyForThisJobPage extends BasePage {

    public ApplyForThisJobPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement>applyForThisJobButton;

    public SubmitYourApplicationPage clickApplyForThisJobButton() {
        applyForThisJobButton.get(0).click();
        return new SubmitYourApplicationPage(driver);
    }


}
