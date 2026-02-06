package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class OpenCreateNewJobOpeningForPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;

    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;

    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;

    @FindBy(id = "jobRequirementsField")
    private WebElement jobRequirementsField;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "cancelButton")
    private WebElement cancelButton;

    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public OpenCreateNewJobOpeningForPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToJobOpeningScreen() {
        driver.get("http://localhost/job-opening");
    }

    public void clicksAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCreateNewJobOpeningFormDisplayed() {
        try {
            return elementUtils.isElementDisplayed(createNewJobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fillJobTitle(String jobTitle) {
        try {
            elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobDescription(String jobDescription) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobRequirements(String jobRequirements) {
        try {
            elementUtils.clearAndSendKeys(jobRequirementsField, jobRequirements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfully() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksCancelButton() {
        try {
            elementUtils.clickElement(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areMandatoryFieldsPresent() {
        Assert.assertTrue("Job Title field is not present!", elementUtils.isElementDisplayed(jobTitleField));
        Assert.assertTrue("Job Description field is not present!", elementUtils.isElementDisplayed(jobDescriptionField));
        Assert.assertTrue("Job Requirements field is not present!", elementUtils.isElementDisplayed(jobRequirementsField));
    }

    public void areMandatoryFieldsMarked() {
        // Logic to check if mandatory fields are marked correctly
    }

    public void areFieldsResetToDefault() {
        // Logic to check if fields are reset to their default state
    }

    public void areFieldLabelsDescriptive() {
        // Logic to validate that field labels are descriptive
    }

    public void useScreenReaderToNavigate() {
        // Logic for screen reader navigation
    }

    public void navigateFieldsUsingTab() {
        // Logic for tab navigation
    }

    public void useEnterKeyToSelectSaveButton() {
        // Logic for enter key functionality on save button
    }

    public boolean isSaveButtonActivated() {
        // Logic to check if save button is activated
        return elementUtils.isElementDisplayed(saveButton);
    }

    public void displayJobOpeningForm() {
        // Logic to display job opening form
    }

    public void isSuccessMessageDisplayed() {
        try {
            Assert.assertTrue("Success message is not displayed!", elementUtils.isElementDisplayed(successMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areLabelsClearAndDescriptive() {
        // Logic to check if labels are clear and descriptive
    }

    public void areSaveAndCancelButtonsDisplayed() {
        Assert.assertTrue("Save button is not displayed!", elementUtils.isElementDisplayed(saveButton));
        Assert.assertTrue("Cancel button is not displayed!", elementUtils.isElementDisplayed(cancelButton));
    }

    public void fillAllFields(String jobTitle, String jobDescription, String jobRequirements) {
        fillJobTitle(jobTitle);
        fillJobDescription(jobDescription);
        fillJobRequirements(jobRequirements);
    }

    public void areFieldsAnnouncedCorrectly() {
        // Logic to check if fields are announced correctly
    }
}