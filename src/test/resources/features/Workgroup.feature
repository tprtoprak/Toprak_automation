Feature: Workgroup
  All HR, Helpdesk, Marketing users should be able to join and sort groups

  @SCRUM-1232
  Scenario Outline: As an HR user, I should be able to join groups
    Given "<HR Users>" users should be able to log in successfully
    And User should click Workgroups from the configure menu
    When User click any Join button under of any group
    #If there is no Join button, it will past next step
    Then User should be able to see Request message

    Examples:
      | HR Users                |
      | hr1@cybertekschool.com  |
      | hr43@cybertekschool.com |
      | hr66@cybertekschool.com |

  @SCRUM-1233
  Scenario Outline: As an HR user, I should be able to sort groups
    Given "<HR Users>" users should be able to log in successfully
    And User should click Workgroups from the configure menu
    When User click right side of SORT BY then click any sorting method
    #It will randomly select one of the sorting methods
    Then User should be able to see changing sort of the groups

    Examples:
      | HR Users                |
      | hr1@cybertekschool.com  |
      | hr43@cybertekschool.com |
      | hr66@cybertekschool.com |

    ######################################################################################

  @SCRUM-1234
  Scenario Outline: As an Helpdesk user, I should be able to join groups
    Given "<Helpdesk Users>" users should be able to log in successfully
    And User should click Workgroups from the configure menu
    When User click any Join button under of any group
    #If there is no Join button, it will past next step
    Then User should be able to see Request message

    Examples:
      | Helpdesk Users                |
      | helpdesk21@cybertekschool.com |
      | helpdesk47@cybertekschool.com |
      | helpdesk33@cybertekschool.com |

  @SCRUM-1235
  Scenario Outline: As an Helpdesk user, I should be able to sort groups
    Given "<Helpdesk Users>" users should be able to log in successfully
    And User should click Workgroups from the configure menu
    When User click right side of SORT BY then click any sorting method
    #It will randomly select one of the sorting methods
    Then User should be able to see changing sort of the groups

    Examples:
      | Helpdesk Users                |
      | helpdesk21@cybertekschool.com |
      | helpdesk47@cybertekschool.com |
      | helpdesk33@cybertekschool.com |


    ######################################################################################

  @SCRUM-1236
  Scenario Outline: As an Marketing user, I should be able to join groups
    Given "<Marketing Users>" users should be able to log in successfully
    And User should click Workgroups from the configure menu
    When User click any Join button under of any group
    #If there is no Join button, it will past next step
    Then User should be able to see Request message

    Examples:
      | Marketing Users                |
      | marketing33@cybertekschool.com |
      | marketing55@cybertekschool.com |
      | marketing96@cybertekschool.com |

  @SCRUM-1237
  Scenario Outline: As an Marketing user, I should be able to sort groups
    Given "<Marketing Users>" users should be able to log in successfully
    And User should click Workgroups from the configure menu
    When User click right side of SORT BY then click any sorting method
    #It will randomly select one of the sorting methods
    Then User should be able to see changing sort of the groups

    Examples:
      | Marketing Users                |
      | marketing33@cybertekschool.com |
      | marketing55@cybertekschool.com |
      | marketing96@cybertekschool.com |
