package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SmartBearBasePage {

    public SmartBearBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id*='username']")
    public WebElement usernameField;

    @FindBy(css = "input[id*='password']")
    public WebElement passwordField;

    @FindBy(css = "input[id*='login_button']")
    public WebElement loginButton;

    @FindBy(css = "span[id*='status']")
    public WebElement loginErrorMessage;



}
