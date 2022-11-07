package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US6Page {

    public US6Page (){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@aria-label='Files']")
    public WebElement filesModuleButton;


}
