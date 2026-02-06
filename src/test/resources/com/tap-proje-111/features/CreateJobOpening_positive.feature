
Feature: CreateJobOpening_positive @feature_create_job_opening

Background: 
  Given the user is on the Dashboard

@navigate-to-job-opening
Scenario Outline: Create Job Opening
  When the user clicks on the "Job Opening" option in the side navigation
  And the user observes the screen transition
  Then the Job Opening screen should be displayed
  And the "Add Job Opening" button should be visible

Examples:
  | action                          |
  | Click on the "Job Opening" option in the side navigation |
  | Observe the screen transition    |

  @open-create-job-opening
  Scenario Outline: Create Job Opening
    When I click on the "Add Job Opening" button
    Then the Create New Job Opening form should be opened
    And the "Save" and "Cancel" buttons should be displayed

  Examples:
    | action                     |
    | Add Job Opening            |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role as "<job_role>"
    And the recruiter selects a Location as "<location>"
    And the recruiter enters Minimum Experience as "<min_experience>"
    And the recruiter enters Maximum Experience as "<max_experience>"
    And the recruiter enters Qualification as "<qualification>"
    And the recruiter enters Short Job Description as "<short_job_description>"
    And the recruiter enters Responsibilities as "<responsibilities>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | min_experience | max_experience | qualification       | short_job_description | responsibilities |
    | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree    | a * 100              | a * 100         |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<minimum_experience>"
    And the recruiter leaves Maximum Experience "<maximum_experience>"
    And the recruiter enters Qualification "<qualification>"
    And the recruiter enters Short Job Description "<short_job_description>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | qualification        | short_job_description                                                                                     |
      | Software Engineer  | New York   | 2                  |                    | Bachelor's Degree     | This is a short job description that outlines the responsibilities and requirements of the position.      |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter selects Employment Type
  And the recruiter selects Work Mode
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | JobRole          | Location   | MinExperience | MaxExperience | EmploymentType | WorkMode |
    | Software Engineer | New York   | 2             | 5             | Full-time      | Remote   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects the Job Role <job_role>
  And the recruiter selects the Location <location>
  And the recruiter enters Minimum Experience <min_experience>
  And the recruiter enters Maximum Experience <max_experience>
  And the recruiter enters Tags <tags>
  And the recruiter selects the Vendor <vendor>
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location   | min_experience | max_experience | tags          | vendor     |
    | Software Engineer | New York   | 2              | 5              | Urgent, Tech  | Vendor A   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When I select a Job Role
  And I select a Location
  And I enter Minimum Experience
  And I enter Maximum Experience
  And I enter Qualification
  And I enter Short Job Description
  And I enter Responsibilities
  And I enter Primary Skills
  And I enter Secondary Skills
  And I enter Total Openings
  And I select Employment Type
  And I select Duration
  And I select Work Mode
  And I select Status
  And I enter Department
  And I enter Industry Type
  And I enter Tags
  And I select Vendors
  And I click on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | JobRole          | Location   | MinExperience | MaxExperience | Qualification       | ShortJobDescription         | Responsibilities            | PrimarySkills | SecondarySkills | TotalOpenings | EmploymentType | Duration   | WorkMode | Status | Department   | IndustryType          | Tags            | Vendors   |
  | Software Engineer | New York   | 2             | 5             | Bachelor's Degree   | Short job description a * 100 | Responsibilities a * 100 | Java, Python  | JavaScript      | 3             | Full-time      | 6 months   | Remote   | Active | Engineering   | Information Technology | Tag1, Tag2     | Vendor1   |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Valid Status
    When the recruiter selects a Job Role
    And the recruiter selects a Location
    And the recruiter enters Minimum Experience
    And the recruiter enters Maximum Experience
    And the recruiter selects a valid Status
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | Job Role          | Location   | Minimum Experience | Maximum Experience | Status |
      | Software Engineer  | New York   | 2                  | 5                  | Open   |

  @feature_create_job_opening
  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<minimum_experience>"
    And the recruiter enters Maximum Experience "<maximum_experience>"
    And the recruiter enters Responsibilities "<responsibilities>"
    And the recruiter enters Primary Skills "<primary_skills>"
    And the recruiter enters Secondary Skills "<secondary_skills>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | responsibilities                                             | primary_skills         | secondary_skills          |
      | Software Engineer  | New York   | 2                  | 5                  | Develop software applications, Collaborate with cross-functional teams | Java, Python, SQL      | JavaScript, HTML, CSS     |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select "<job_role>" as the Job Role
    And I select "<location>" as the Location
    And I enter "<min_experience>" as the Minimum Experience
    And I enter "<max_experience>" as the Maximum Experience
    And I select "<duration>" as the Duration
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role         | location   | min_experience | max_experience | duration   |
    | Software Engineer | New York   | 2              | 5              | 6 months   |
