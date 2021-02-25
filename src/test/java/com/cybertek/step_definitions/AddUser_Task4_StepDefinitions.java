package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;

public class AddUser_Task4_StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Then("Librarians click on UserTitle  link")
    public void librariansClickOnUserTitleLink() {
        BrowserUtils.wait(2);
        loginPage.UserLink.click();
    }

    @Then("Librarians click on Add User link")
    public void librarians_click_on_add_user_link() {
        BrowserUtils.wait(2);
        loginPage.addUserLink.click();

    }

    @Then("Librarians add users with all valid info")
    public void librarians_add_users_with_all_valid_info() {
        Faker faker =new Faker();
        BrowserUtils.wait(2);

        loginPage.fullNameBox.sendKeys( faker.artist().name() );
        loginPage.passwordBox.sendKeys(faker.phoneNumber().cellPhone());
        loginPage.emailBox.sendKeys(faker.name()+"@gmail.com");
        loginPage.addressBox.sendKeys(faker.address().fullAddress());

    }

    @Then("Librarians able to close the add user window with \"\"close\"\" button")
    public void librarians_able_to_close_the_add_user_window_with_close_button() {
        BrowserUtils.wait(3);
        loginPage.cancelBox.click();

    }

    @Then("Librarians able to edit user info")
    public void librarians_able_to_edit_user_info() {
        BrowserUtils.wait(3);
        loginPage.editUserLink.click();

    }

    @Then("Librarians click on Save changes")
    public void librariansClickOnSaveChanges() {
        BrowserUtils.wait(2);
        loginPage.saveLink.click();
        
    }

    @Then("Librarians sees the user updated  alert")
    public void librariansSeesTheUserUpdatedAlert() {
        BrowserUtils.waitForVisibilty(loginPage.updatedAlert, 3);
        Driver.closeDriver();
    }


}
