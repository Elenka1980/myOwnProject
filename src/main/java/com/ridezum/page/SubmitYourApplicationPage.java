package com.ridezum.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SubmitYourApplicationPage extends BasePage {

    public SubmitYourApplicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"name\"]")
    private WebElement nameField;

    @FindBy(css = "[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "[name=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "input[name=\"org\"]")
    private WebElement currentCompanyField;

    @FindBy(css = "input[name=\"urls[LinkedIn]\"]")
    private WebElement linkedlnField;

    @FindBy(css = "[name=\"eeo[gender]\"]")
    private WebElement genderField;

    @FindBy(css = "[name=\"eeo[race]\"]")
    private WebElement raceField;

    @FindBy(css = "[name=\"eeo[veteran]\"]")
    private WebElement veteranField;

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private WebElement submitApplicatinButton;

    @FindBy(css = ".error-message")
    private List<WebElement>errorFields;

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }
    public void inputCurrentCompany(String currentCompany) {
        currentCompanyField.sendKeys(currentCompany);
    }

    public void inputLinkedln(String linkedln) {
        linkedlnField.sendKeys(linkedln);
    }

    public void selectGender(int i) {
        Select select = new Select(genderField);
        select.selectByIndex(i);
    }
    public void selectRace(int i) {
        Select select = new Select(raceField);
        select.selectByIndex(i);
    }

    public void selectVeteran(int i) {
        Select select = new Select(veteranField);
        select.selectByIndex(i);
    }
    public void clicksubmitApplicatinButton() {

        submitApplicatinButton.click();
    }

    public String selectErrorNote() {

        return errorFields.get(0).getText();
    }



}








