package com.indeed.step_definitions;

import com.indeed.pages.agileprocrmPage;
import com.indeed.pages.crm24Page;
import com.indeed.pages.workgroupList;
import com.indeed.utilities.ConfigurationReader;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

public class WorkgroupSteps {
    String firstBefore,firstAfter,secondBefore,secondAfter;

    agileprocrmPage agileprocrmPage = new agileprocrmPage();
    crm24Page crm24Page = new crm24Page();
    workgroupList workgroupList = new workgroupList();
    Random random = new Random();


    @Given("{string} users should be able to log in successfully")
    public void usersShouldBeAbleToLogInSuccessfully(String users) {
        Driver.getDriver().get(ConfigurationReader.getProperty("agileprocrmUrl"));
        agileprocrmPage.loginBox.sendKeys(users);
        agileprocrmPage.PasswordBox.sendKeys("UserUser");
        agileprocrmPage.loginBtn.click();
    }
    @Given("User should click Workgroups from the configure menu")
    public void user_should_click_workgroups_from_the_configure_menu() {
        crm24Page.workgroupsBtn.click();
    }

    @When("User click any Join button under of any group")
    public void user_click_any_join_button_under_of_any_group() throws InterruptedException {
        Thread.sleep(2000);
                try {
                    crm24Page.anyJoinBtn.isDisplayed();
                    crm24Page.anyJoinBtn.click();
                }catch (Exception e){
                    System.out.println("Info: There is no Join Button");
                }
    }
    @Then("User should be able to see Request message")
    public void user_should_be_able_to_see_request_message() throws InterruptedException {
        Thread.sleep(2000);
        if (crm24Page.requestText.isDisplayed()) {
            System.out.println("Info: User has been sent a request to be a member of a group");
        }
    }

    @When("User click right side of SORT BY then click any sorting method")
    public void user_click_right_side_of_sort_by_then_click_any_sorting_method() throws InterruptedException {
        String firstBefore = workgroupList.firstFirst.getText();
        String secondBefore = workgroupList.firstSecond.getText();
        crm24Page.sortBtn.click();
        Thread.sleep(2000);
        switch (random.nextInt(6)){
            case 1 :
                crm24Page.timeJoined.click();
                break;
            case 2 :
                crm24Page.lastViewed.click();
                break;
            case 3 :
                crm24Page.numberOfMembers.click();
                break;
            case 4 :
                crm24Page.lastActive.click();
                break;
            case 5 :
                crm24Page.timeCreated.click();
                break;
        }

    }
    @Then("User should be able to see changing sort of the groups")
    public void user_should_be_able_to_see_changing_sort_of_the_groups() throws InterruptedException {
        Thread.sleep(2000);
        String firstAfter = workgroupList.firstFirst.getText();
        String secondAfter = workgroupList.firstSecond.getText();
        if (!(firstBefore==firstAfter & secondBefore == secondAfter)){
        }else {
            System.out.println("Sorting does not work");
        }


    }



}
