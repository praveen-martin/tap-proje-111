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

    @FindBy(id = "dashboardLink")
    private WebElement dashboardLink;

    @FindBy(id = "jobOpeningOption")
    private WebElement jobOpeningOption;

    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;

    @FindBy(id = "jobRoleDropdown")
    private WebElement jobRoleDropdown;

    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;

    @FindBy(id = "minExperienceInput")
    private WebElement minExperienceInput;

    @FindBy(id = "maxExperienceInput")
    private WebElement maxExperienceInput;

    @FindBy(id = "qualificationInput")
    private WebElement qualificationInput;

    @FindBy(id = "shortJobDescriptionInput")
    private WebElement shortJobDescriptionInput;

    @FindBy(id = "responsibilitiesInput")
    private WebElement responsibilitiesInput;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "cancelButton")
    private WebElement cancelButton;

    @FindBy(id = "jobOpeningForm")
    private WebElement jobOpeningForm;

    @FindBy(id = "jobOpeningList")
    private WebElement jobOpeningList;

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

    public void clickSave() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobOpeningSavedSuccessfully() {
        try {
            WebElement successMessage = driver.findElement(By.id("successMessage"));
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobOpeningAvailableInList() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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

    public void areSaveCancelButtonsDisplayed() {
        try {
            boolean isSaveDisplayed = elementUtils.isElementDisplayed(saveButton);
            boolean isCancelDisplayed = elementUtils.isElementDisplayed(cancelButton);
            Assert.assertTrue("Save button should be displayed", isSaveDisplayed);
            Assert.assertTrue("Cancel button should be displayed", isCancelDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendors(String vendor) {
        try {
            WebElement vendorDropdown = driver.findElement(By.id("vendorDropdown"));
            elementUtils.clickElement(vendorDropdown);
            elementUtils.selectOptionInDropdown(vendorDropdown, vendor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTags(String tags) {
        try {
            WebElement tagsInput = driver.findElement(By.id("tagsInput"));
            elementUtils.clearAndSendKeys(tagsInput, tags);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectEmploymentType(String employmentType) {
        try {
            WebElement employmentTypeDropdown = driver.findElement(By.id("employmentTypeDropdown"));
            elementUtils.clickElement(employmentTypeDropdown);
            elementUtils.selectOptionInDropdown(employmentTypeDropdown, employmentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWorkMode(String workMode) {
        try {
            WebElement workModeDropdown = driver.findElement(By.id("workModeDropdown"));
            elementUtils.clickElement(workModeDropdown);
            elementUtils.selectOptionInDropdown(workModeDropdown, workMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterIndustryType(String industryType) {
        try {
            WebElement industryTypeInput = driver.findElement(By.id("industryTypeInput"));
            elementUtils.clearAndSendKeys(industryTypeInput, industryType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTotalOpenings(String totalOpenings) {
        try {
            WebElement totalOpeningsInput = driver.findElement(By.id("totalOpeningsInput"));
            elementUtils.clearAndSendKeys(totalOpeningsInput, totalOpenings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDuration(String duration) {
        try {
            WebElement durationInput = driver.findElement(By.id("durationInput"));
            elementUtils.clearAndSendKeys(durationInput, duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPrimarySkills(String primarySkills) {
        try {
            WebElement primarySkillsInput = driver.findElement(By.id("primarySkillsInput"));
            elementUtils.clearAndSendKeys(primarySkillsInput, primarySkills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterSecondarySkills(String secondarySkills) {
        try {
            WebElement secondarySkillsInput = driver.findElement(By.id("secondarySkillsInput"));
            elementUtils.clearAndSendKeys(secondarySkillsInput, secondarySkills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStatus(String status) {
        try {
            WebElement statusDropdown = driver.findElement(By.id("statusDropdown"));
            elementUtils.clickElement(statusDropdown);
            elementUtils.selectOptionInDropdown(statusDropdown, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}