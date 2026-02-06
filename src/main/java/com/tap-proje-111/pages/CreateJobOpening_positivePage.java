package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dashboardLink") // Unique locator for dashboard link
    private WebElement dashboardLink;

    @FindBy(id = "sideNav") // Unique locator for side navigation
    private WebElement sideNav;

    @FindBy(id = "jobOpeningButton") // Unique locator for job opening button
    private WebElement jobOpeningButton;

    @FindBy(id = "addJobOpeningButton") // Unique locator for add job opening button
    private WebElement addJobOpeningButton;

    @FindBy(id = "jobRoleDropdown") // Unique locator for job role dropdown
    private WebElement jobRoleDropdown;

    @FindBy(id = "locationDropdown") // Unique locator for location dropdown
    private WebElement locationDropdown;

    @FindBy(id = "minExperienceInput") // Unique locator for minimum experience input
    private WebElement minExperienceInput;

    @FindBy(id = "maxExperienceInput") // Unique locator for maximum experience input
    private WebElement maxExperienceInput;

    @FindBy(id = "qualificationInput") // Unique locator for qualification input
    private WebElement qualificationInput;

    @FindBy(id = "shortJobDescriptionInput") // Unique locator for short job description input
    private WebElement shortJobDescriptionInput;

    @FindBy(id = "responsibilitiesInput") // Unique locator for responsibilities input
    private WebElement responsibilitiesInput;

    @FindBy(id = "tagsInput") // Unique locator for tags input
    private WebElement tagsInput;

    @FindBy(id = "vendorDropdown") // Unique locator for vendor dropdown
    private WebElement vendorDropdown;

    @FindBy(id = "employmentTypeDropdown") // Unique locator for employment type dropdown
    private WebElement employmentTypeDropdown;

    @FindBy(id = "workModeDropdown") // Unique locator for work mode dropdown
    private WebElement workModeDropdown;

    @FindBy(id = "primarySkillsInput") // Unique locator for primary skills input
    private WebElement primarySkillsInput;

    @FindBy(id = "secondarySkillsInput") // Unique locator for secondary skills input
    private WebElement secondarySkillsInput;

    @FindBy(id = "totalOpeningsInput") // Unique locator for total openings input
    private WebElement totalOpeningsInput;

    @FindBy(id = "statusDropdown") // Unique locator for status dropdown
    private WebElement statusDropdown;

    @FindBy(id = "departmentInput") // Unique locator for department input
    private WebElement departmentInput;

    @FindBy(id = "industryTypeInput") // Unique locator for industry type input
    private WebElement industryTypeInput;

    @FindBy(id = "durationDropdown") // Unique locator for duration dropdown
    private WebElement durationDropdown;

    @FindBy(id = "createJobOpeningForm") // Unique locator for create job opening form
    private WebElement createJobOpeningForm;

    @FindBy(id = "submitJobOpeningButton") // Unique locator for submit job opening button
    private WebElement submitJobOpeningButton;

    @FindBy(id = "successMessage") // Unique locator for success message
    private WebElement successMessage;

    @FindBy(id = "jobOpeningScreen") // Unique locator for job opening screen
    private WebElement jobOpeningScreen;

    @FindBy(id = "saveButton") // Unique locator for save button
    private WebElement saveButton;

    @FindBy(id = "cancelButton") // Unique locator for cancel button
    private WebElement cancelButton;

    public void navigateToDashboard() {
        try {
            elementUtils.clickElement(dashboardLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSideNavigationOption(String action) {
        try {
            elementUtils.clickElement(sideNav); // Assuming this opens the side navigation
            // Logic to select the specific option based on 'action'
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickJobOpeningOption() {
        try {
            elementUtils.clickElement(jobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectJobRole(String jobRole) {
        try {
            elementUtils.clickElement(jobRoleDropdown);
            elementUtils.selectOptionInDropdown(jobRoleDropdown, jobRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.clickElement(locationDropdown);
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinimumExperience(String minExperience) {
        try {
            elementUtils.clearAndSendKeys(minExperienceInput, minExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaximumExperience(String maxExperience) {
        try {
            elementUtils.clearAndSendKeys(maxExperienceInput, maxExperience);
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

    public void enterTags(String tags) {
        try {
            elementUtils.clearAndSendKeys(tagsInput, tags);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendor(String vendor) {
        try {
            elementUtils.clickElement(vendorDropdown);
            elementUtils.selectOptionInDropdown(vendorDropdown, vendor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectEmploymentType(String employmentType) {
        try {
            elementUtils.clickElement(employmentTypeDropdown);
            elementUtils.selectOptionInDropdown(employmentTypeDropdown, employmentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWorkMode(String workMode) {
        try {
            elementUtils.clickElement(workModeDropdown);
            elementUtils.selectOptionInDropdown(workModeDropdown, workMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPrimarySkills(String primarySkills) {
        try {
            elementUtils.clearAndSendKeys(primarySkillsInput, primarySkills);
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

    public void enterTotalOpenings(String totalOpenings) {
        try {
            elementUtils.clearAndSendKeys(totalOpeningsInput, totalOpenings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStatus(String status) {
        try {
            elementUtils.clickElement(statusDropdown);
            elementUtils.selectOptionInDropdown(statusDropdown, status);
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

    public void enterIndustryType(String industryType) {
        try {
            elementUtils.clearAndSendKeys(industryTypeInput, industryType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDuration(String duration) {
        try {
            elementUtils.clickElement(durationDropdown);
            elementUtils.selectOptionInDropdown(durationDropdown, duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAddJobOpeningButtonVisible() {
        try {
            return elementUtils.isElementDisplayed(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void isCreateNewJobOpeningFormOpened() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(createJobOpeningForm), "Create New Job Opening Form is not opened.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningAvailableInList() {
        try {
            WebElement jobOpeningElement = driver.findElement(By.xpath("//div[@class='job-opening-list']//li[contains(text(),'Job Title')]"));
            Assert.assertTrue(elementUtils.isElementDisplayed(jobOpeningElement), "Job Opening is not available in the list.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOn() {
        try {
            elementUtils.clickElement(submitJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isButtonVisible() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(submitJobOpeningButton), "Submit Job Opening button is not visible.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningScreenDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(jobOpeningScreen), "Job Opening Screen is not displayed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningSavedSuccessfully() {
        try {
            String actualMessage = elementUtils.getElementText(successMessage);
            String expectedMessage = "Job Opening saved successfully.";
            Assert.assertEquals(actualMessage, expectedMessage, "Job Opening not saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areSaveCancelButtonsDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(saveButton), "Save button is not displayed.");
            Assert.assertTrue(elementUtils.isElementDisplayed(cancelButton), "Cancel button is not displayed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveMaximumExperience() {
        try {
            elementUtils.clearAndSendKeys(maxExperienceInput, "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSave() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}