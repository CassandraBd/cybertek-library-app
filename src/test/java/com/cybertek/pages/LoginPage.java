package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends LibrarianPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "inputEmail")
    public WebElement userEmail;

    @FindBy(id = "inputPassword")
    public WebElement userPassword;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='menu_item']/li[2]/a/span[1]")
    public WebElement UserLink;

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a/span[1]")
    public WebElement BorrowingBookLink;

    @FindBy(id = "book_categories")
    public WebElement bookCategories;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[4]/label")
    public WebElement loginPassWord;

    @FindBy(xpath = "//th")
    public List<WebElement> BorrowingBookHeader;

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a/span[1]")
    public WebElement LoginBookTitle;

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a/span[1]")
    public WebElement LoginDashBoardTitle;

    @FindBy(xpath = "//*[.='Log Out']")
    public WebElement LogOutLink;

    @FindBy(id = "navbarDropdown")
    public WebElement userTitle;

    @FindBy (id = "user_status")
    public WebElement userStatusLink;


    public void login(String userName,String Password)
    {
        userEmail.sendKeys(userName);
        BrowserUtils.wait(1);
        userPassword.sendKeys(Password, Keys.ENTER);
    }
}
