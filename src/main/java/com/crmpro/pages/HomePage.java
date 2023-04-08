package com.crmpro.pages;

import com.crmpro.base.BaseCLass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class HomePage extends BaseCLass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".logo_text")
    WebElement homePageLogo;
    @FindBy(xpath = "[title=\"Contacts\"]")
    WebElement contactsLink;
    public void isLogoDisplayed(){
        driver.switchTo().frame("mainpanel");
        assertTrue(homePageLogo.isDisplayed());
    }
    public ContactsPage clickContactsLink(){
        driver.switchTo().frame("mainpanel");
        contactsLink.click();
        return new ContactsPage();
    }

}
