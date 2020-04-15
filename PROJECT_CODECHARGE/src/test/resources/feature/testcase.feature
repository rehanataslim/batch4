@taskmanager

Feature: taskmanager website

@tc_01_login
Scenario Outline: Login to the TaskManager

Given Open the  taskmanager website  Browser
Then  enter the "<username1>" and "<password1>"
And  click on Login button


Examples:
|username1    |password1 |
|admin		 |admin |



@tc_02_addproject
Scenario: Add Project to the TaskManager Website

Given Open the Website in the Browser
When click on the administration
When Click on the Projects
When Click on the Add New Project
Then Enter the Project Name 
And Click on the Add Button

@tc_03_searchproject
Scenario: Search the  New Project

Given Open the website  Browser
When  Click On Task List
Then  Select the Newly Entered Project
And Click on the Search button

@tc_04_addtask
Scenario: Add Task to the  Newly entered Project

Given Launch the Website in the Browser
When  Click on the AddNewTask
Then Enter all the details
And Click on the Add button

@tc_05_logout
Scenario: logout the page

Given Launch the Website Browser
And  click administration
 And  click the logout

