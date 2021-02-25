package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShowRecords_Task5_StepDefinitions {

    LoginPage usersPage = new LoginPage();
    Select select;


    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        BrowserUtils.wait(2);
        select = new Select(usersPage.showRecordsDropdown);
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected + "", actual);

    }

    @Then("show record should have following options:")
    public void show_record_should_have_following_options(List<String> options) {
        select = new Select(usersPage.showRecordsDropdown);
        List<WebElement> webElements = select.getOptions();
        List<String> actualText = BrowserUtils.getElementsText(webElements);
        Assert.assertEquals(options, actualText);
        Driver.closeDriver();


    }
}
