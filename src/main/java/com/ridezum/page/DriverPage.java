package com.ridezum.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DriverPage extends BasePage{

    public DriverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneNumberField;

    @FindBy(css = "option")
    private List<WebElement>regionField;

    @FindBy(css = "#application_form_zipcode")
    private WebElement zipCodeField;

    @FindBy(css = "#application_form_refcode")
    private WebElement refCodeField;

    @FindBy(css = ".main-menu__link")
    private List<WebElement>submitButton;



    public void inputFirstName(String firstName)
    {
        firstNameField.sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }
    public void inputEmailField(String email) {
        emailField.sendKeys(email);
    }
    public void inputPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void selectRegion(int i) {
        regionField.get(1).click();
    }
    public void inputZipCodeField(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }
    public void inputRefCodeField(String refCode) {
        refCodeField.sendKeys(refCode);
    }
    public void clickSubmitButton(int i) {
        submitButton.get(i).click();
    }






}
