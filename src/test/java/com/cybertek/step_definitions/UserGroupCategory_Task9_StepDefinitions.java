package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserGroupCategory_Task9_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    Select select;

    @Then("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
        BrowserUtils.wait(2);
        loginPage.userGroupLink.click();

    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String > options) {
        select= new Select( loginPage.userGroupLink);
        List<String> userOptions = BrowserUtils.getElementsText(select.getOptions());
        BrowserUtils.wait(2);
        Assert.assertEquals("List are not equal",options,userOptions);
        Driver.closeDriver();


    }

}
