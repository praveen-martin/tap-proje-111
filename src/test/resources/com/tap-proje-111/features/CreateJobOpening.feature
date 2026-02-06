
@feature_create_job_opening
Feature: CreateJobOpening

  Background: 
    Given the recruiter is on the Dashboard

  @navigate_to_job_opening
  Scenario Outline: Create Job Opening
    When the recruiter clicks on the "<job_opening_option>" option in the side navigation
    Then the Job Opening screen should be displayed
    And the "<add_job_opening_button>" button should be visible

    Examples:
      | job_opening_option      | add_job_opening_button |
      | Job Opening             | Add Job Opening        |

  @open_create_new_job_form
  Scenario Outline: Create Job Opening
    When the recruiter clicks on the "Add Job Opening" button
    Then the Create New Job Opening form should be opened
    And the "Save" and "Cancel" buttons should be displayed

  Examples:
    | action                       |
    | Add Job Opening              |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects "<job_role>" as the Job Role
    And the recruiter selects "<location>" as the Location
    And the recruiter enters "<minimum_experience>" as the Minimum Experience
    And the recruiter enters "<maximum_experience>" as the Maximum Experience
    And the recruiter enters "<qualification>" as the Qualification
    And the recruiter enters "<short_job_description>" as the Short Job Description
    And the recruiter enters "<responsibilities>" as the Responsibilities
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | minimum_experience | maximum_experience | qualification       | short_job_description              | responsibilities                                      |
    | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | This is a short job description.  | 1. Develop software solutions. 2. Collaborate with team members. |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects "<job_role>" as the Job Role
  And the recruiter selects "<location>" as the Location
  And the recruiter enters "<minimum_experience>" as the Minimum Experience
  And the recruiter leaves Maximum Experience blank
  And the recruiter enters "<qualification>" as the Qualification
  And the recruiter leaves Responsibilities blank
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role         | location   | minimum_experience | qualification        |
  | Software Engineer | New York   | 3                  | Bachelor's Degree     |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters Tags
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct tags

  Examples:
    | job_role          | location   | min_experience | max_experience | qualification       | tags                  |
    | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree     | Java, Python, SQL     |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role <job_role>
    And the recruiter selects the Location <location>
    And the recruiter enters the Minimum Experience <minimum_experience>
    And the recruiter enters the Maximum Experience <maximum_experience>
    And the recruiter enters the Qualification <qualification>
    And the recruiter selects the Vendor <vendor>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct vendor

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | qualification       | vendor     |
      | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | Vendor A   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role <job_role>
  And the recruiter selects a Location <location>
  And the recruiter enters Minimum Experience <min_experience>
  And the recruiter enters Maximum Experience <max_experience>
  And the recruiter enters Qualification <qualification>
  And the recruiter selects a valid Work Mode <work_mode>
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct work mode

Examples:
  | job_role          | location   | min_experience | max_experience | qualification       | work_mode |
  | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree    | Remote     |

@valid-job-opening
Scenario Outline: Create Job Opening
  When I select a Job Role "<job_role>"
  And I select a Location "<location>"
  And I enter Minimum Experience "<minimum_experience>"
  And I enter Maximum Experience "<maximum_experience>"
  And I enter Qualification "<qualification>"
  And I enter a valid Department "<department>"
  And I click on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct department

Examples:
  | job_role          | location   | minimum_experience | maximum_experience | qualification       | department      |
  | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | Engineering      |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters a valid Industry Type
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct industry type

Examples:
  | job_role          | location   | min_experience | max_experience | qualification       | industry_type          |
  | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree    | Information Technology  |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters valid Primary Skills
  And the recruiter enters valid Secondary Skills
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct skills

Examples:
  | Job Role      | Location      | Minimum Experience | Maximum Experience | Qualification | Primary Skills | Secondary Skills |
  | Software Engineer | New York | 2 years           | 5 years           | Bachelor's Degree | Java, Selenium | TestNG, JUnit |
