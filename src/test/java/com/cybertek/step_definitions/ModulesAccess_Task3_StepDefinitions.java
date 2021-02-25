package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ModulesAccess_Task3_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Lib-19URL"));
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String userEmail, String Password) {
        loginPage.login(userEmail, Password);

    }

    @When("Librarian enter {string} and {string}")
    public void librarianEnterAnd(String LibEmail, String LibPassword) {
        LibEmail = ConfigurationReader.getProperty("lib14_userName");
        LibPassword = ConfigurationReader.getProperty("lib14_password");
        loginPage.userEmail.sendKeys(LibEmail);
        loginPage.userPassword.sendKeys(LibPassword, Keys.ENTER);

    }

    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> linkList) {
        BrowserUtils.wait(5);
        ArrayList<WebElement> elements = new ArrayList<>(Driver.getDriver().findElements(By.xpath("//span[@class='title']")));

        for(int i = 0; i < elements.size(); i++)
        {
            Assert.assertEquals(elements.get(i).getText(), linkList.get(i));

        }

        Driver.closeDriver();

    }


}
