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
driver = DriverFactory.getDriver();
createJobOpeningPage.navigateToDashboard();
}
@When("the user clicks on the {string} option in the side navigation")
public void the_user_clicks_on_the_option_in_the_side_navigation(String action) {
createJobOpeningPage.clicksOnJobOpeningOption(action);
}
@And("the user observes the screen transition")
public void the_user_observes_the_screen_transition() {
createJobOpeningPage.observeScreenTransition();
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String button) {
createJobOpeningPage.isButtonVisible(button);
}
@When("I click on the {string} button")
public void i_click_on_the_button(String button) {
createJobOpeningPage.clicksOnAddJobOpeningButton(button);
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the {string} and {string} buttons should be displayed")
public void the_and_buttons_should_be_displayed(String button1, String button2) {
createJobOpeningPage.areButtonsDisplayed(button1, button2);
}
@When("the recruiter selects a Job Role as {string}")
public void the_recruiter_selects_a_job_role_as(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@And("the recruiter selects a Location as {string}")
public void the_recruiter_selects_a_location_as(String location) {
createJobOpeningPage.selectLocation(location);
}
@And("the recruiter enters Minimum Experience as {string}")
public void the_recruiter_enters_minimum_experience_as(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@And("the recruiter enters Maximum Experience as {string}")
public void the_recruiter_enters_maximum_experience_as(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@And("the recruiter enters Qualification as {string}")
public void the_recruiter_enters_qualification_as(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@And("the recruiter enters Short Job Description as {string}")
public void the_recruiter_enters_short_job_description_as(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@And("the recruiter enters Responsibilities as {string}")
public void the_recruiter_enters_responsibilities_as(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@And("the recruiter clicks on {string}")
public void the_recruiter_clicks_on(String action) {
createJobOpeningPage.clicksOnSave(action);
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@And("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@When("the recruiter selects Employment Type")
public void the_recruiter_selects_employment_type() {
createJobOpeningPage.selectEmploymentType();
}
@When("the recruiter selects Work Mode")
public void the_recruiter_selects_work_mode() {
createJobOpeningPage.selectWorkMode();
}
@When("the recruiter enters Tags {string}")
public void the_recruiter_enters_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@When("the recruiter selects the Vendor {string}")
public void the_recruiter_selects_the_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@When("the recruiter enters Total Openings {string}")
public void the_recruiter_enters_total_openings(String totalOpenings) {
createJobOpeningPage.enterTotalOpenings(totalOpenings);
}
@When("the recruiter enters Duration {string}")
public void the_recruiter_enters_duration(String duration) {
createJobOpeningPage.enterDuration(duration);
}
@When("the recruiter enters Department {string}")
public void the_recruiter_enters_department(String department) {
createJobOpeningPage.enterDepartment(department);
}
@When("the recruiter enters Industry Type {string}")
public void the_recruiter_enters_industry_type(String industryType) {
createJobOpeningPage.enterIndustryType(industryType);
}
@When("the recruiter selects a valid Status")
public void the_recruiter_selects_a_valid_status() {
createJobOpeningPage.selectValidStatus();
}

@Given("the user clicks on the job opening option in the side navigation")
public void the_user_clicks_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickOnJobOpeningOption();
}
@When("the recruiter selects a job role")
public void the_recruiter_selects_a_job_role() {
createJobOpeningPage.selectJobRole();
}
@When("i select {string} as the job role")
public void i_select_as_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("i select duration")
public void i_select_duration() {
createJobOpeningPage.selectDuration();
}
@When("the recruiter enters maximum experience {string}")
public void the_recruiter_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@When("i enter total openings")
public void i_enter_total_openings() {
createJobOpeningPage.enterTotalOpenings();
}
@When("i enter department")
public void i_enter_department() {
createJobOpeningPage.enterDepartment();
}
@When("i select work mode")
public void i_select_work_mode() {
createJobOpeningPage.selectWorkMode();
}
@When("the recruiter enters responsibilities {string}")
public void the_recruiter_enters_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@When("the recruiter enters secondary skills {string}")
public void the_recruiter_enters_secondary_skills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@When("i select {string} as the duration")
public void i_select_as_the_duration(String duration) {
createJobOpeningPage.selectDuration(duration);
}
@When("the recruiter selects the job role {string}")
public void the_recruiter_selects_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("i enter industry type")
public void i_enter_industry_type() {
createJobOpeningPage.enterIndustryType();
}
@When("i enter short job description")
public void i_enter_short_job_description() {
createJobOpeningPage.enterShortJobDescription();
}
@When("i enter qualification")
public void i_enter_qualification() {
createJobOpeningPage.enterQualification();
}
@When("the recruiter enters minimum experience {string}")
public void the_recruiter_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("i enter responsibilities")
public void i_enter_responsibilities() {
createJobOpeningPage.enterResponsibilities();
}
@When("i select status")
public void i_select_status() {
createJobOpeningPage.selectStatus();
}
@When("i enter primary skills")
public void i_enter_primary_skills() {
createJobOpeningPage.enterPrimarySkills();
}
@When("i select employment type")
public void i_select_employment_type() {
createJobOpeningPage.selectEmploymentType();
}
@When("the recruiter enters short job description {string}")
public void the_recruiter_enters_short_job_description(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@Then("the save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@When("the recruiter selects a location {string}")
public void the_recruiter_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the recruiter clicks on save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clickSave();
}
@When("i enter tags")
public void i_enter_tags() {
createJobOpeningPage.enterTags();
}
@When("i select {string} as the location")
public void i_select_as_the_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("i select vendors")
public void i_select_vendors() {
createJobOpeningPage.selectVendors();
}
@When("i enter minimum experience {string}")
public void i_enter_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("i enter {string} as the minimum experience")
public void i_enter_as_the_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@When("the recruiter enters primary skills {string}")
public void the_recruiter_enters_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@When("i clickElement on the add job opening button")
public void i_click_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@When("i clickElement on save")
public void i_click_on_save() {
createJobOpeningPage.clickSave();
}
@When("i enter {string} as the maximum experience")
public void i_enter_as_the_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
}