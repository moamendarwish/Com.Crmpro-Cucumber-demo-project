package steps;

import com.crmpro.base.BaseCLass;
import com.crmpro.pages.ContactsPage;
import com.crmpro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ContactsSteps extends BaseCLass {
    HomePage homePage = new HomePage();
    ContactsPage contactsPage = new ContactsPage();

    @And("clicks on contacts")
    public void clicks_on_contacts() {
        contactsPage = homePage.clickContactsLink();
    }

    @Then("email text field is visible")
    public void email_Text_Field_Is_Visible() {
        contactsPage.isEmailFieldVisible();
    }

    @And("clicks on add new contact")
    public void clicks_On_Add_New_Contact() {
        contactsPage.addNewContact();
    }

    @And("fills the firstName {string} and the lastName {string} and click save")
    public void fills_The_Firstname_And_Password(String userName, String lastName) {
        contactsPage.enterCredentials(userName, lastName);
    }

    @Then("new contact should be added")
    public void new_Contact_Should_Be_Added() {
        contactsPage.isNextElementVisible();
    }
}
