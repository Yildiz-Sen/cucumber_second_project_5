package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartBearOrdersPage {

    public SmartBearOrdersPage(){super();}
    @FindBy(css = "select[id*='ddlProduct']")
    public WebElement productDropdownButton;

    @FindBy(css = "select[id*='ddlProduct'] option")
    public List<WebElement> productDropdownOptions;

    @FindBy(css = "input[id*='Quantity']")
    public WebElement quantityField;

    @FindBy(css = "input[id*='txtName']")
    public WebElement customerNameField;

    @FindBy(css = "input[id*='TextBox2']")
    public WebElement streetField;

    @FindBy(css = "input[id*='TextBox3']")
    public WebElement cityField;

    @FindBy(css = "input[id*='TextBox4']")
    public WebElement stateField;

    @FindBy(css = "input[id*='TextBox5']")
    public WebElement zipCodeField;

    @FindBy(css = "input[id*='cardList']")
    public List<WebElement> creditCardSelection;

    @FindBy(css = "input[id*='TextBox6']")
    public WebElement cardNumberField;

    @FindBy(css = "input[id*='TextBox1']")
    public WebElement monthYearField;

    @FindBy(css = "a[id*='InsertButton']")
    public WebElement processButton;

    @FindBy(xpath = "(//table[@id='ctl00_MainContent_orderGrid'] //td)[2]")
    public WebElement viewOrderName;

    @FindBy(css = "input[id*='btnDelete']")
    public WebElement deleteButton;



}
