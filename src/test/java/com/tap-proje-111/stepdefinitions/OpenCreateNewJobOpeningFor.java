package com.tap-proje-111.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-proje-111.pages.OpenCreateNewJobOpeningForPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
OpenCreateNewJobOpeningForPage jobOpeningPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the user is on the Job Opening screen")
public void the_user_is_on_the_job_opening_screen() {
jobOpeningPage.navigateToJobOpeningScreen();
}
@When("the user locates the Add Job Opening button")
public void the_user_locates_the_add_job_opening_button() {
jobOpeningPage.locateAddJobOpeningButton();
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
jobOpeningPage.clicksAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
jobOpeningPage.areJobOpeningFieldsPresent();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
jobOpeningPage.areSaveAndCancelButtonsDisplayed();
}
@When("the admin clicks on the Add Job Opening button to open the form")
public void the_admin_clicks_on_the_add_job_opening_button_to_open_the_form() {
jobOpeningPage.clicksAddJobOpeningButton();
}
@Then("the form should include mandatory fields such as Job Title, Job Description, and Job Requirements")
public void the_form_should_include_mandatory_fields() {
jobOpeningPage.areMandatoryFieldsPresent();
}
@And("each mandatory field should be clearly marked with an asterisk")
public void each_mandatory_field_should_be_clearly_marked_with_an_asterisk() {
jobOpeningPage.areMandatoryFieldsMarked();
}
@When("the user fills in the Job Title with {string}")
public void the_user_fills_in_the_job_title_with(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user fills in the Job Description with {string}")
public void the_user_fills_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@When("the user fills in the Job Requirements with {string}")
public void the_user_fills_in_the_job_requirements_with(String jobRequirements) {
jobOpeningPage.fillJobRequirements(jobRequirements);
}
@When("the user clicks on the Save button")
public void the_user_clicks_on_the_save_button() {
jobOpeningPage.clicksSaveButton();
}
@Then("the job opening is saved successfully")
public void the_job_opening_is_saved_successfully() {
jobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the user is redirected to the Job Opening screen")
public void the_user_is_redirected_to_the_job_opening_screen() {
jobOpeningPage.isUserOnJobOpeningScreen();
}
@Then("a success message is displayed confirming the job opening has been created")
public void a_success_message_is_displayed_confirming_the_job_opening_has_been_created() {
jobOpeningPage.isSuccessMessageDisplayed();
}
@When("the user clicks on the Cancel button")
public void the_user_clicks_on_the_cancel_button() {
jobOpeningPage.clicksCancelButton();
}
@Then("the Create New Job Opening form should be closed")
public void the_create_new_job_opening_form_should_be_closed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user should be returned to the Job Opening screen without any data being saved")
public void the_user_should_be_returned_to_the_job_opening_screen_without_any_data_being_saved() {
jobOpeningPage.isUserOnJobOpeningScreen();
}
@When("the user enters {string} in the Job Title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user enters {string} in the Job Description field")
public void the_user_enters_in_the_job_description_field(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@When("the user clicks on the Add Job Opening button again")
public void the_user_clicks_on_the_add_job_opening_button_again() {
jobOpeningPage.clicksAddJobOpeningButton();
}
@Then("all fields are reset to their default state")
public void all_fields_are_reset_to_their_default_state() {
jobOpeningPage.areFieldsResetToDefault();
}
@When("the user uses a screen reader to navigate through the form fields")
public void the_user_uses_a_screen_reader_to_navigate_through_the_form_fields() {
jobOpeningPage.useScreenReaderToNavigate();
}
@Then("all form fields should be announced correctly by the screen reader")
public void all_form_fields_should_be_announced_correctly_by_the_screen_reader() {
jobOpeningPage.areFieldsAnnouncedCorrectly();
}
@Then("labels for each field should be clearElement and descriptive")
public void labels_for_each_field_should_be_clear_and_descriptive() {
jobOpeningPage.areLabelsClearAndDescriptive();
}
@When("the user uses the Tab key to navigate through the form fields")
public void the_user_uses_the_tab_key_to_navigate_through_the_form_fields() {
jobOpeningPage.useTabKeyToNavigate();
}
@When("the user uses the Enter key to select the Save button")
public void the_user_uses_the_enter_key_to_select_the_save_button() {
jobOpeningPage.useEnterKeyToSelectSaveButton();
}
@Then("the Save button is activated using the Enter key")
public void the_save_button_is_activated_using_the_enter_key() {
jobOpeningPage.isSaveButtonActivated();
}

@Given("the create new job opening form is displayed again")
public void the_create_new_job_opening_form_is_displayed_again() {
jobOpeningPage.displayJobOpeningForm();
}
@When("the user fills in the job title {string} and job description {string}")
public void the_user_fills_in_the_job_title_and_job_description(String jobTitle, String jobDescription) {
jobOpeningPage.fillJobTitle(jobTitle);
jobOpeningPage.fillJobDescription(jobDescription);
}
@When("the user fills in valid data in all mandatory fields leaves optional fields empty with title {string} and description {string}")
public void the_user_fills_in_valid_data_in_all_mandatory_fields_leaves_optional_fields_empty(String jobTitle, String jobDescription) {
jobOpeningPage.fillMandatoryFields(jobTitle, jobDescription);
}
@When("the user fills in valid data in all mandatory fields and some optional fields with title {string}, description {string}, and optional {string}")
public void the_user_fills_in_valid_data_in_all_mandatory_fields_some_optional_fields(String jobTitle, String jobDescription, String optionalField) {
jobOpeningPage.fillMandatoryAndSomeOptionalFields(jobTitle, jobDescription, optionalField);
}
@When("the user fills in valid data with the job title as {string}")
public void the_user_fills_in_valid_data_with_the_job_title_as(String jobTitle) {
jobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user can navigate through all fields using the tab key")
public void the_user_can_navigate_through_all_fields_using_the_tab_key() {
jobOpeningPage.navigateFieldsUsingTab();
}
@When("the user fills in valid data with the job requirements as {string}")
public void the_user_fills_in_valid_data_with_the_job_requirements_as(String jobRequirements) {
jobOpeningPage.fillJobRequirements(jobRequirements);
}
@When("the user fills in valid data with the job description as {string}")
public void the_user_fills_in_valid_data_with_the_job_description_as(String jobDescription) {
jobOpeningPage.fillJobDescription(jobDescription);
}
@When("the user fills in valid data in all mandatory fields and all optional fields with title {string}, description {string}, and optional {string}")
public void the_user_fills_in_valid_data_in_all_mandatory_fields_all_optional_fields(String jobTitle, String jobDescription, String optionalField) {
jobOpeningPage.fillAllFields(jobTitle, jobDescription, optionalField);
}
@Then("labels for each field should be clearElement descriptive")
public void labels_for_each_field_should_be_clear_descriptive() {
jobOpeningPage.areFieldLabelsDescriptive();
}
@And("the user clicks on the add job opening button to open the form")
public void the_user_clicks_on_the_add_job_opening_button_to_open_the_form() {
jobOpeningPage.clickAddJobOpeningButton();
}
}