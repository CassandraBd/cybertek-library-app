package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserStatus_Task10_1_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    Select select;

    @And("the user  can click Status dropdown")
    public void theUserCanClickStatusDropdown() {
        loginPage.userStatusLink.click();
    }


    @Then("the user click Status dropdown")
    public void the_user_click_status_dropdown(List<String> options) {
    //    BrowserUtils.waitForVisibilty(loginPage.userStatusLink, 3);
    //    List<String> actualColumnNames = BrowserUtils.getElementsText(loginPage.userStatusLink);
    //    Assert.assertEquals(actualColumnNames, options);
        select = new Select(loginPage.userStatusLink);
        List<String> userOptions = BrowserUtils.getElementsText(select.getOptions());
        System.out.println("userOptions = " + userOptions);
        System.out.println("options = " + options);
        BrowserUtils.wait(2);
        Assert.assertEquals("List are not equal", options, userOptions);
        Driver.closeDriver();
    }

}
