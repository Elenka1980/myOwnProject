package com.ridezum.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SubmitYourApplicationPage extends BasePage {

    public SubmitYourApplicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".application-field")
    public List<WebDriver>applycationFormFields;

    public void inputName(String name) {
    }
}
