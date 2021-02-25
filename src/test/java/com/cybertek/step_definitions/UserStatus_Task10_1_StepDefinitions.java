package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserStatus_Task10_1_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    Select select;

    @And("the user  can click Status dropdown")
    public void theUserCanClickStatusDropdown() {
        BrowserUtils.wait(2);
        loginPage.userStatus.click();
    }


    @Then("the user click Status dropdown")
    public void the_user_click_status_dropdown(List<String> expectedColumnNames) {
      //  BrowserUtils.waitForVisibilty(loginPage.userStatus, 3);
     //   List<String> actualColumnNames = BrowserUtils.getElementsText(loginPage.userStatus);

    //    Assert.assertEquals(actualColumnNames, expectedColumnNames);
    }

}
