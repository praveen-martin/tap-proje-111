package com.tap-proje-111.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-proje-111.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the recruiter is on the Dashboard")
public void the_recruiter_is_on_the_dashboard() {
driver = DriverFactory.getDriver();
createJobOpeningPage.navigateToDashboard();
}
@When("the recruiter clicks on the {string} option in the side navigation")
public void the_recruiter_clicks_on_the_option_in_the_side_navigation(String jobOpeningOption) {
createJobOpeningPage.clickOnJobOpeningOption(jobOpeningOption);
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
"Job Opening screen is not displayed", createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String addJobOpeningButton) {
addJobOpeningButton + " button is not visible", createJobOpeningPage.isButtonVisible(addJobOpeningButton);
}
@When("the recruiter clicks on the {string} button")
public void the_recruiter_clicks_on_the_button(String addJobOpeningButton) {
createJobOpeningPage.clickOnAddJobOpeningButton(addJobOpeningButton);
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
"Create New Job Opening form is not opened", createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the {string} and {string} buttons should be displayed")
public void the_and_buttons_should_be_displayed(String saveButton, String cancelButton) {
saveButton + " button is not displayed", createJobOpeningPage.isButtonDisplayed(saveButton);
cancelButton + " button is not displayed", createJobOpeningPage.isButtonDisplayed(cancelButton);
}
@When("the recruiter selects {string} as the Job Role")
public void the_recruiter_selects_as_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the recruiter selects {string} as the Location")
public void the_recruiter_selects_as_the_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the recruiter enters {string} as the Minimum Experience")
public void the_recruiter_enters_as_the_minimum_experience(String minimumExperience) {
createJobOpeningPage.enterMinimumExperience(minimumExperience);
}
@When("the recruiter enters {string} as the Maximum Experience")
public void the_recruiter_enters_as_the_maximum_experience(String maximumExperience) {
createJobOpeningPage.enterMaximumExperience(maximumExperience);
}
@When("the recruiter enters {string} as the Qualification")
public void the_recruiter_enters_as_the_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the recruiter enters {string} as the Short Job Description")
public void the_recruiter_enters_as_the_short_job_description(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@When("the recruiter enters {string} as the Responsibilities")
public void the_recruiter_enters_as_the_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@When("the recruiter clicks on {string}")
public void the_recruiter_clicks_on(String action) {
createJobOpeningPage.clickOnSave(action);
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
"Job opening was not saved successfully", createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
"Job opening is not available in the Job Opening list", createJobOpeningPage.isJobOpeningAvailableInList();
}
@When("the recruiter leaves Maximum Experience blank")
public void the_recruiter_leaves_maximum_experience_blank() {
createJobOpeningPage.leaveMaximumExperienceBlank();
}
@When("the recruiter leaves Responsibilities blank")
public void the_recruiter_leaves_responsibilities_blank() {
createJobOpeningPage.leaveResponsibilitiesBlank();
}
@When("the recruiter enters Tags")
public void the_recruiter_enters_tags() {
createJobOpeningPage.enterTags();
}
@When("the recruiter selects the Vendor {string}")
public void the_recruiter_selects_the_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@When("the recruiter selects a valid Work Mode {string}")
public void the_recruiter_selects_a_valid_work_mode(String workMode) {
createJobOpeningPage.selectWorkMode(workMode);
}
@When("the recruiter enters a valid Department {string}")
public void the_recruiter_enters_a_valid_department(String department) {
createJobOpeningPage.enterDepartment(department);
}
@When("the recruiter enters valid Primary Skills")
public void the_recruiter_enters_valid_primary_skills() {
createJobOpeningPage.enterPrimarySkills();
}
@When("the recruiter enters valid Secondary Skills")
public void the_recruiter_enters_valid_secondary_skills() {
createJobOpeningPage.enterSecondarySkills();
}
@Then("the job opening should be available in the Job Opening list with the correct tags")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_tags() {
"Job opening is not available with the correct tags", createJobOpeningPage.isJobOpeningAvailableWithCorrectTags();
}
@Then("the job opening should be available in the Job Opening list with the correct vendor")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_vendor() {
"Job opening is not available with the correct vendor", createJobOpeningPage.isJobOpeningAvailableWithCorrectVendor();
}
@Then("the job opening should be available in the Job Opening list with the correct work mode")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_work_mode() {
"Job opening is not available with the correct work mode", createJobOpeningPage.isJobOpeningAvailableWithCorrectWorkMode();
}
@Then("the job opening should be available in the Job Opening list with the correct department")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_department() {
"Job opening is not available with the correct department", createJobOpeningPage.isJobOpeningAvailableWithCorrectDepartment();
}
@Then("the job opening should be available in the Job Opening list with the correct industry type")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_industry_type() {
"Job opening is not available with the correct industry type", createJobOpeningPage.isJobOpeningAvailableWithCorrectIndustryType();
}
@Then("the job opening should be available in the Job Opening list with the correct skills")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_skills() {
"Job opening is not available with the correct skills", createJobOpeningPage.isJobOpeningAvailableWithCorrectSkills();
}

@Given("the recruiter enters minimum experience {string}")
public void the_recruiter_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("the recruiter enters maximum experience {string}")
public void the_recruiter_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@When("the recruiter selects the job role {string}")
public void the_recruiter_selects_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the recruiter enters a valid industry type")
public void the_recruiter_enters_a_valid_industry_type() {
createJobOpeningPage.enterValidIndustryType();
}
@When("i select a job role {string}")
public void i_select_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("i select a location {string}")
public void i_select_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the recruiter enters qualification {string}")
public void the_recruiter_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the recruiter clicks on the add job opening button")
public void the_recruiter_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@Then("the save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@When("i enter a valid department {string}")
public void i_enter_a_valid_department(String department) {
createJobOpeningPage.enterValidDepartment(department);
}
@When("the recruiter clicks on save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clickSave();
}
@When("i enter minimum experience {string}")
public void i_enter_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("i enter maximum experience {string}")
public void i_enter_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
}