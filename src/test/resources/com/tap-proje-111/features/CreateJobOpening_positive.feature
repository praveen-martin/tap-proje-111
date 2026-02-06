
Feature: CreateJobOpening_positive @feature_create_job_opening

Background: 
  Given the user is on the Dashboard

@navigate-to-job-opening
Scenario Outline: Create Job Opening
  When the user clicks on the "Job Opening" option in the side navigation
  Then the Job Opening screen should be displayed
  And the "Add Job Opening" button should be visible

Examples:
  | action                          |
  | Click on the "Job Opening" option in the side navigation |

  @open-create-job-opening-form
  Scenario Outline: Create Job Opening
    When the user clicks on the "Add Job Opening" button
    Then the Create New Job Opening form should be opened
    And the "Save" and "Cancel" buttons should be displayed

  Examples:
    | action                       |
    | Add Job Opening              |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role "<job_role>"
  And the recruiter selects a Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter enters Qualification "<qualification>"
  And the recruiter enters Short Job Description "<short_job_description>"
  And the recruiter enters Responsibilities "<responsibilities>"
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | min_experience | max_experience | qualification       | short_job_description | responsibilities     |
  | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree    | a * 100              | a * 100             |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role <job_role>
    And the recruiter selects a Location <location>
    And the recruiter enters Minimum Experience <minimum_experience>
    And the recruiter leaves Maximum Experience <maximum_experience>
    And the recruiter enters Qualification <qualification>
    And the recruiter enters Short Job Description <short_job_description>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | qualification        | short_job_description                                                                 |
      | Software Engineer  | New York   | 2                  |                    | Bachelor's Degree     | This is a short job description that outlines the responsibilities and requirements of the position. |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role as <job_role>
    And the recruiter selects the Location as <location>
    And the recruiter enters Minimum Experience as <minimum_experience>
    And the recruiter enters Maximum Experience as <maximum_experience>
    And the recruiter selects Employment Type as <employment_type>
    And the recruiter selects Work Mode as <work_mode>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | minimum_experience | maximum_experience | employment_type | work_mode |
    | Software Engineer  | New York   | 2                  | 5                  | Full-time       | Remote    |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role as <job_role>
  And the recruiter selects a Location as <location>
  And the recruiter enters Minimum Experience as <min_experience>
  And the recruiter enters Maximum Experience as <max_experience>
  And the recruiter enters Tags as <tags>
  And the recruiter selects a Vendor as <vendor>
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role         | location   | min_experience | max_experience | tags          | vendor     |
  | Software Engineer | New York   | 2              | 5              | Urgent, Tech  | Vendor A   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects "<job_role>" as the Job Role
  And the recruiter selects "<location>" as the Location
  And the recruiter enters "<minimum_experience>" as the Minimum Experience
  And the recruiter enters "<maximum_experience>" as the Maximum Experience
  And the recruiter enters "<qualification>" as the Qualification
  And the recruiter enters "<short_job_description>" as the Short Job Description
  And the recruiter enters "<responsibilities>" as the Responsibilities
  And the recruiter enters "<primary_skills>" as the Primary Skills
  And the recruiter enters "<secondary_skills>" as the Secondary Skills
  And the recruiter enters "<total_openings>" as the Total Openings
  And the recruiter selects "<employment_type>" as the Employment Type
  And the recruiter selects "<duration>" as the Duration
  And the recruiter selects "<work_mode>" as the Work Mode
  And the recruiter selects "<status>" as the Status
  And the recruiter enters "<department>" as the Department
  And the recruiter enters "<industry_type>" as the Industry Type
  And the recruiter enters "<tags>" as the Tags
  And the recruiter selects "<vendor>" as the Vendor
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | minimum_experience | maximum_experience | qualification       | short_job_description         | responsibilities            | primary_skills | secondary_skills | total_openings | employment_type | duration   | work_mode | status | department   | industry_type         | tags         | vendor   |
  | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | Short job description a * 100 | Responsibilities a * 100 | Java, Python   | JavaScript       | 3              | Full-time      | 6 months  | Remote    | Active | Engineering   | Information Technology | Tag1, Tag2  | Vendor1  |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role "<job_role>"
    And the recruiter selects the Location "<location>"
    And the recruiter enters the Minimum Experience "<min_experience>"
    And the recruiter enters the Maximum Experience "<max_experience>"
    And the recruiter selects a valid Status "<status>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | max_experience | status |
      | Software Engineer  | New York  | 2              | 5              | Open   |

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
    When I select the Job Role <job_role>
    And I select the Location <location>
    And I enter Minimum Experience <minimum_experience>
    And I enter Maximum Experience <maximum_experience>
    And I select a valid Duration <duration>
    And I click on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | duration     |
      | Software Engineer  | New York   | 2                  | 5                  | 6 months     |
