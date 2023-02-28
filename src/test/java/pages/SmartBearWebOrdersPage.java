package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartBearWebOrdersPage extends SmartBearBasePage {

    public SmartBearWebOrdersPage() {
        super();
    }

    @FindBy(css = "ul[id='ctl00_menu'] li")
    public List<WebElement> webOrderItems;

    @FindBy(css = "a[id*='CheckAll']")
    public WebElement checkAllButton;

    @FindBy(css = "a[id*='UncheckAll']")
    public WebElement unCheckAllButton;

    @FindBy(css = "input[id*='OrderSelector']")
    public List<WebElement> checkBox;

    @FindBy(css = "div[id*='orderMessage']")
    public WebElement emptyOrdersMessage;


    public void clickOnCard(String cardText) {
        for (WebElement card : webOrderItems) {
            if (card.getText().equals(cardText)) {
                card.click();
                break;
            }


        }
    }
}
