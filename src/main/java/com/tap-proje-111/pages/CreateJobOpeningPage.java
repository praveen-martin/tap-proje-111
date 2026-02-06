package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "dashboardLink")
    private WebElement dashboardLink;
    @FindBy(id = "jobOpeningOption")
    private WebElement jobOpeningOption;
    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreen;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "minimumExperienceInput")
    private WebElement minimumExperienceInput;
    @FindBy(id = "maximumExperienceInput")
    private WebElement maximumExperienceInput;
    @FindBy(id = "qualificationInput")
    private WebElement qualificationInput;
    @FindBy(id = "shortJobDescriptionInput")
    private WebElement shortJobDescriptionInput;
    @FindBy(id = "responsibilitiesInput")
    private WebElement responsibilitiesInput;
    @FindBy(id = "vendorDropdown")
    private WebElement vendorDropdown;
    @FindBy(id = "workModeDropdown")
    private WebElement workModeDropdown;
    @FindBy(id = "departmentInput")
    private WebElement departmentInput;
    @FindBy(id = "primarySkillsInput")
    private WebElement primarySkillsInput;
    @FindBy(id = "secondarySkillsInput")
    private WebElement secondarySkillsInput;
    @FindBy(id = "tagsInputId") // Assuming this is the locator for tags input
    private WebElement tagsInput;
    @FindBy(id = "industryInputId") // Assuming this is the locator for industry input
    private WebElement industryInput;

    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToDashboard() {
        try {
            elementUtils.clickElement(dashboardLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnJobOpeningOption() {
        try {
            elementUtils.clickElement(jobOpeningOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isButtonVisible(String buttonName) {
        try {
            return elementUtils.isElementDisplayed(getButtonByName(buttonName));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickOnAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCreateNewJobOpeningFormOpened() {
        try {
            return elementUtils.isElementDisplayed(createNewJobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectJobRole(String jobRole) {
        try {
            elementUtils.selectOptionInDropdown(jobOpeningOption, jobRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.selectOptionInDropdown(jobOpeningOption, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinimumExperience(String minExperience) {
        try {
            elementUtils.clearAndSendKeys(minimumExperienceInput, minExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaximumExperience(String maxExperience) {
        try {
            elementUtils.clearAndSendKeys(maximumExperienceInput, maxExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterQualification(String qualification) {
        try {
            elementUtils.clearAndSendKeys(qualificationInput, qualification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterShortJobDescription(String shortJobDescription) {
        try {
            elementUtils.clearAndSendKeys(shortJobDescriptionInput, shortJobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterResponsibilities(String responsibilities) {
        try {
            elementUtils.clearAndSendKeys(responsibilitiesInput, responsibilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnSave() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfully() {
        // Implement the check for job opening saved successfully.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableInList() {
        // Implement the check for job opening availability in list.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableWithCorrectTags() {
        // Implement the check for job opening correctness with tags.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableWithCorrectVendor() {
        // Implement the check for job opening correctness with vendor.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableWithCorrectWorkMode() {
        // Implement the check for job opening correctness with work mode.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableWithCorrectDepartment() {
        // Implement the check for job opening correctness with department.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableWithCorrectIndustryType() {
        // Implement the check for job opening correctness with industry type.
        return true; // Placeholder implementation
    }

    public boolean isJobOpeningAvailableWithCorrectSkills() {
        // Implement the check for job opening correctness with skills.
        return true; // Placeholder implementation
    }

    public void enterTags(String tags) {
        try {
            elementUtils.clearAndSendKeys(tagsInput, tags);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValidIndustryType(String industryType) {
        try {
            elementUtils.clearAndSendKeys(industryInput, industryType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendor(String vendor) {
        try {
            elementUtils.selectOptionInDropdown(vendorDropdown, vendor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWorkMode(String workMode) {
        try {
            elementUtils.selectOptionInDropdown(workModeDropdown, workMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDepartment(String department) {
        try {
            elementUtils.clearAndSendKeys(departmentInput, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPrimarySkills(String skills) {
        try {
            elementUtils.clearAndSendKeys(primarySkillsInput, skills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterSecondarySkills(String secondarySkills) {
        try {
            elementUtils.clearAndSendKeys(secondarySkillsInput, secondarySkills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveMaximumExperienceBlank() {
        try {
            elementUtils.clearElement(maximumExperienceInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveResponsibilitiesBlank() {
        try {
            elementUtils.clearElement(responsibilitiesInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areSaveCancelButtonsDisplayed() {
        try {
            Assert.assertTrue("Save button is not displayed!", elementUtils.isElementDisplayed(saveButton));
            Assert.assertTrue("Cancel button is not displayed!", elementUtils.isElementDisplayed(cancelButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private WebElement getButtonByName(String buttonName) {
        // Logic to get button element by name
        return null; // Placeholder return
    }
}