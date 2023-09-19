package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class agileprocrmPage {


    public agileprocrmPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement loginBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement PasswordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

}
