package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class BorrowingBooks_Task8_StepDefinitions {

    LoginPage student = new LoginPage();


    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {
         student.BorrowingBookLink.click();
    }

    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> options) {
        BrowserUtils.wait(1);
        System.out.println( "option = "  +options);
        List<String> titles= new ArrayList<>();
        for (int i=0;i< student.BorrowingBookHeader.size();i++)
        {
            titles.add(student.BorrowingBookHeader.get(i).getText());

        }
        Assert.assertEquals("list are not equal",options,titles);
        Driver.closeDriver();

    }
}
