package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class workgroupList {

    public workgroupList() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='sonet-groups-group-block-row']//div[1]")
    public static WebElement firstFirst;

    @FindBy(xpath = "//div[@class='sonet-groups-group-block-row']//div[2]")
    public WebElement firstSecond;



}
