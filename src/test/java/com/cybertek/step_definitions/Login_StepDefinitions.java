package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();



    @Given("user on login page")
    public void user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Lib-19URL"));
        Driver.getDriver().manage().window().maximize();
    }


    @When("user enter {string} and  {string}")
    public void user_enter_and(String userEmail, String Password) {
        loginPage.login(userEmail, Password);
    }

    @Then("user see  {string} and {string}")
    public void user_see_and(String role, String page) {
        BrowserUtils.wait(2);

        if (role.equalsIgnoreCase("student"))
        {
            Assert.assertEquals(page,loginPage.LoginBookTitle.getText());
        }
        if (role.equals("librarian"))
        {
            Assert.assertEquals(page,loginPage.LoginDashBoardTitle.getText());
        }

    }

    @Then("user Logout from homePage")
    public void user_logout_from_home_page() {
        BrowserUtils.wait(2);
        loginPage.userTitle.click();

        BrowserUtils.waitForVisibilty(loginPage.LogOutLink,3);

        loginPage.LogOutLink.click();
        Driver.closeDriver();

    }

}
