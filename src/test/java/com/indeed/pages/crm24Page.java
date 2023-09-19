package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crm24Page {

    public crm24Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Workgroups")
    public WebElement workgroupsBtn;

    @FindBy(xpath = "//*[text()='Join']")
    public WebElement anyJoinBtn;

    @FindBy(xpath = "//*[text()='Request has been sent']")
    public WebElement requestText;

    @FindBy(id = "bx-sonet-groups-sort-value")
    public WebElement sortBtn;

    @FindBy(xpath = "//*[text()='ABC order']")
    public WebElement abcOrder;

    @FindBy(xpath = "//*[text()='Time joined']")
    public WebElement timeJoined;

    @FindBy(xpath = "//*[text()='Last viewed']")
    public WebElement lastViewed;

    @FindBy(xpath = "//*[text()='Number of members']")
    public WebElement numberOfMembers;

    @FindBy(xpath = "//*[text()='Last active']")
    public WebElement lastActive;

    @FindBy(xpath = "//*[text()='Time created']")
    public WebElement timeCreated;

}
