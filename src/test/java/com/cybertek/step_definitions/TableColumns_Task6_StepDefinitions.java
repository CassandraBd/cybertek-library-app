package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TableColumns_Task6_StepDefinitions {

    LoginPage student = new LoginPage();
    Select select;

    @Then("the user should see following names")
    public void the_user_should_see_following_names(List<String> categories) {
        select = new Select(student.bookCategories);
        List<String> listElements = BrowserUtils.getElementsText(select.getOptions());
        List<String> assertList = new ArrayList<>();
        System.out.println(listElements);

        for (String eachlink : categories)
        {
            if(listElements.contains((eachlink)));
            {
                assertList.add(eachlink);
            }
        }
        System.out.println("Assert List =  "+assertList);
        Assert.assertEquals(categories,assertList);

        Driver.closeDriver();

    }
}
