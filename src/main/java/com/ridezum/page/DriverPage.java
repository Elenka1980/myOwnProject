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



    public void inputFirstName(String firstName) {
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


/*
    public void inputFirstName(String firstName) {

    }
    public void inputLastName(String lastName) {
        applyNowFields.get(1).sendKeys(lastName);
    }
    public void inputEmail(String email) {
        applyNowFields.get(2).sendKeys(email);
    }
    public void inputPhoneNumber(String phoneNumber) {
        applyNowFields.get(3).sendKeys(phoneNumber);
    }
    public void inputRegion(String region) {
        applyNowFields.get(4).sendKeys(region);
    }
    public void inputZipCod(String zipCode) {
        applyNowFields.get(5).sendKeys(zipCode);
    }
    public void inputRefCod(String refCode) {
        applyNowFields.get(6).sendKeys(refCode);
    }

 */





}
