package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShowRecordsPage {

    public ShowRecordsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

    // @FindBy(xpath = "//th")
    @FindBy(tagName = "th")
    public List<WebElement> tableHeaders;

    @FindBy(linkText = "Users")
    public WebElement userLink;
}
