package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserManagementTable_10_2_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Then("the user should  see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedColumnNames) {
        BrowserUtils.waitForVisibilty(loginPage.showRecordsDropdown, 3);
        List<String> actualColumnNames = BrowserUtils.getElementsText(loginPage.tableHeaders);

        Assert.assertEquals(expectedColumnNames, actualColumnNames);
        Driver.closeDriver();


    }
}
