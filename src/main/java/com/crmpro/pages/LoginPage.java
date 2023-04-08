package com.crmpro.pages;

import com.crmpro.base.BaseCLass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class LoginPage extends BaseCLass {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (name = "username")
    WebElement username ;
    @FindBy (name = "password")
    WebElement password ;
    @FindBy (xpath = "//input[@value = 'Login']")
    WebElement login ;
    public HomePage performLogin(String user,String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
        return new HomePage();
    }
    public void isUserNameDisplayed(){
        assertTrue("errorMessage!",username.isDisplayed());
    }

}
