package com.crmpro.pages;

import com.crmpro.base.BaseCLass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class ContactsPage extends BaseCLass {

    public ContactsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "cs_email")
    WebElement emailTextField;
    @FindBy(css = "[value='New Contact']")
    WebElement newContactLink;
    @FindBy(name = "first_name")
    WebElement firstName;
    @FindBy(name = "surname")
    WebElement lastName;
    @FindBy(css = "[value='Save']")
    WebElement saveButton;
    @FindBy(css = "[value='Next']")
    WebElement nextTextInBox;

    public void isEmailFieldVisible(){
        assertTrue(emailTextField.isDisplayed());
    }
    public void addNewContact(){
        newContactLink.click();
    }
    public void enterCredentials(String first_name ,String last_name){
        firstName.sendKeys(first_name);
        lastName.sendKeys(last_name);
        saveButton.click();
    }
    public void isNextElementVisible(){
        assertTrue(nextTextInBox.isDisplayed());
    }


}
