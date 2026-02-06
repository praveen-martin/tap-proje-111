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
@Given("the user is on the Dashboard")
public void the_user_is_on_the_dashboard() {
createJobOpeningPage.navigateToDashboard();
}
@When("the user clicks on the {string} option in the side navigation")
public void the_user_clicks_on_option_in_the_side_navigation(String action) {
createJobOpeningPage.clicksOnSideNavigationOption(action);
}
// DUPLICATE: @Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
// DUPLICATE: @And("the {string} button should be visible")
public void the_button_should_be_visible(String button) {
createJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_button(String button) {
createJobOpeningPage.clicksOnButton(button);
}
// DUPLICATE: @Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
// DUPLICATE: @And("the {string} and {string} buttons should be displayed")
public void the_buttons_should_be_displayed(String button1, String button2) {
createJobOpeningPage.isButtonVisible(button1);
createJobOpeningPage.isButtonVisible(button2);
}
@When("the recruiter selects a Job Role {string}")
public void the_recruiter_selects_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the recruiter selects a Location {string}")
public void the_recruiter_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the recruiter enters Minimum Experience {string}")
public void the_recruiter_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("the recruiter enters Maximum Experience {string}")
public void the_recruiter_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@When("the recruiter enters Qualification {string}")
public void the_recruiter_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the recruiter enters Short Job Description {string}")
public void the_recruiter_enters_short_job_description(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@When("the recruiter enters Responsibilities {string}")
public void the_recruiter_enters_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
// DUPLICATE: @When("the recruiter clicks on {string}")
public void the_recruiter_clicks_on(String action) {
createJobOpeningPage.clicksOn(action);
}
// DUPLICATE: @Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
// DUPLICATE: @Then("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@When("the recruiter enters Tags {string}")
public void the_recruiter_enters_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@When("the recruiter selects a Vendor {string}")
public void the_recruiter_selects_a_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@When("the recruiter selects Employment Type as {string}")
public void the_recruiter_selects_employment_type_as(String employmentType) {
createJobOpeningPage.selectEmploymentType(employmentType);
}
@When("the recruiter selects Work Mode as {string}")
public void the_recruiter_selects_work_mode_as(String workMode) {
createJobOpeningPage.selectWorkMode(workMode);
}
@When("the recruiter enters Primary Skills {string}")
public void the_recruiter_enters_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@When("the recruiter enters Secondary Skills {string}")
public void the_recruiter_enters_secondary_skills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@When("the recruiter enters Total Openings {string}")
public void the_recruiter_enters_total_openings(String totalOpenings) {
createJobOpeningPage.enterTotalOpenings(totalOpenings);
}
@When("the recruiter selects a valid Status {string}")
public void the_recruiter_selects_a_valid_status(String status) {
createJobOpeningPage.selectStatus(status);
}
@When("the recruiter enters Department {string}")
public void the_recruiter_enters_department(String department) {
createJobOpeningPage.enterDepartment(department);
}
@When("the recruiter enters Industry Type {string}")
public void the_recruiter_enters_industry_type(String industryType) {
createJobOpeningPage.enterIndustryType(industryType);
}
@When("the recruiter selects Duration as {string}")
public void the_recruiter_selects_duration_as(String duration) {
createJobOpeningPage.selectDuration(duration);
}
@When("the recruiter leaves Maximum Experience {string}")
public void the_recruiter_leaves_maximum_experience(String maxExperience) {
createJobOpeningPage.leaveMaximumExperience(maxExperience);
}
@When("the recruiter selects the Job Role as {string}")
public void the_recruiter_selects_the_job_role_as(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}

@Given("the recruiter selects {string} as the job role")
public void the_recruiter_selects_as_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the user clicks on the job opening option in the side navigation")
public void the_user_clicks_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickJobOpeningOption();
}
@Given("the recruiter selects {string} as the employment type")
public void the_recruiter_selects_as_the_employment_type(String employmentType) {
createJobOpeningPage.selectEmploymentType(employmentType);
}
@Given("the recruiter selects the location as {string}")
public void the_recruiter_selects_the_location_as(String location) {
createJobOpeningPage.selectLocation(location);
}
@Given("the recruiter enters minimum experience as {string}")
public void the_recruiter_enters_minimum_experience_as(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Given("the recruiter enters the maximum experience {string}")
public void the_recruiter_enters_the_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Given("the recruiter selects {string} as the vendor")
public void the_recruiter_selects_as_the_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@Given("the recruiter enters {string} as the secondary skills")
public void the_recruiter_enters_as_the_secondary_skills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@Given("the recruiter enters {string} as the qualification")
public void the_recruiter_enters_as_the_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@Given("the recruiter enters {string} as the total openings")
public void the_recruiter_enters_as_the_total_openings(String totalOpenings) {
createJobOpeningPage.enterTotalOpenings(totalOpenings);
}
@Given("the recruiter selects {string} as the duration")
public void the_recruiter_selects_as_the_duration(String duration) {
createJobOpeningPage.selectDuration(duration);
}
@Given("the recruiter enters {string} as the tags")
public void the_recruiter_enters_as_the_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@Given("the recruiter enters {string} as the industry type")
public void the_recruiter_enters_as_the_industry_type(String industryType) {
createJobOpeningPage.enterIndustryType(industryType);
}
// DUPLICATE: @When("the recruiter clicks on save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clickSave();
}
@Given("the recruiter selects {string} as the work mode")
public void the_recruiter_selects_as_the_work_mode(String workMode) {
createJobOpeningPage.selectWorkMode(workMode);
}
@Given("the recruiter enters {string} as the responsibilities")
public void the_recruiter_enters_as_the_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@Given("the recruiter enters {string} as the primary skills")
public void the_recruiter_enters_as_the_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@Given("the recruiter selects a job role as {string}")
public void the_recruiter_selects_a_job_role_as(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
// DUPLICATE: @Then("the save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
}