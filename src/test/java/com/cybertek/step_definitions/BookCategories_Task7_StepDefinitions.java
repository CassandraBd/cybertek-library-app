package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookCategories_Task7_StepDefinitions {

    LoginPage student = new LoginPage();

    @When("student click on Book Categories")
    public void student_click_on_book_categories() {
        student.bookCategories.click();
    }

    @Then("user sees All options")
    public void user_sees_all_options(List<String> categories) {
        BrowserUtils.wait(2);

        Select select = new Select(student.bookCategories);
        List<String> listElements = BrowserUtils.getElementsText(select.getOptions());
        List<String> assertList = new ArrayList<>();

        Assert.assertEquals( "list are not equal", categories,listElements);
        Driver.closeDriver();

    }

}
