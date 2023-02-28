package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import pages.SmartBearOrdersPage;
import pages.SmartBearWebOrdersPage;
import utils.Driver;
import utils.DropdownHandler;

public class SmartBearWebOrdersSteps {

    WebDriver driver;
    SmartBearOrdersPage smartBearOrdersPage;
    SmartBearWebOrdersPage smartBearWebOrdersPage;
    Faker faker;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        smartBearWebOrdersPage = new SmartBearWebOrdersPage();
        smartBearOrdersPage = new SmartBearOrdersPage();
        faker = new Faker();
    }


    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String orderMenuItem) {
        switch (orderMenuItem) {
            case "View all orders":
                smartBearWebOrdersPage.webOrderItems.get(0).click();
                break;
            case "View all products":
                smartBearWebOrdersPage.clickOnCard();
                break;
            case "Order":
                smartBearOrdersPage.processButton.click();
            default:
                throw new NotFoundException("The heading text is not defined!");
                if (orderMenuItem.equals("Order"))
                    smartBearWebOrdersPage.clickOnCard(orderMenuItem);
        }
    }

    @And("user selects {string} as product")
    public void userSelectsAsProduct() {
        DropdownHandler.clickOnDropdownOption(smartBearOrdersPage.productDropdownButton,
                smartBearOrdersPage.productDropdownOptions,
                "FamilyAlbum");

    }
    @And("user enters {int} as quantity")
    public void userEntersAsQuantity(int quantity) {
        smartBearOrdersPage.quantityField.sendKeys("2");
    }

    @And("user enters all address information")
    public void userEntersAllAddressInformation() {
        smartBearOrdersPage.customerNameField.sendKeys(faker.name().fullName());
        smartBearOrdersPage.streetField.sendKeys(faker.address().streetAddress());
        smartBearOrdersPage.cityField.sendKeys(faker.address().city());
        smartBearOrdersPage.stateField.sendKeys(faker.address().state());
        smartBearOrdersPage.zipCodeField.sendKeys(faker.address().zipCode());
    }

    @And("user enters all payment information")
    public void userEntersAllPaymentInformation() {
        smartBearOrdersPage.creditCardSelection.get(0).click();
        smartBearOrdersPage.cardNumberField.sendKeys(faker.finance().creditCard());
        smartBearOrdersPage.monthYearField.sendKeys("11/22");
    }

    @Then("user should see their order displayed in the {string} table")
    public void userShouldSeeTheirOrderDisplayedInTheTable(String viewOrder) {

    }

    @And("validate all information entered displayed correct with the order")
    public void validateAllInformationEnteredDisplayedCorrectWithTheOrder() {

    }

    @Then("validate all orders are deleted from the {string}")
    public void validateAllOrdersAreDeletedFromThe(String str) {

    }

    @And("validate user sees {string} message")
    public void validateUserSeesMessage(String alertMessage) {
        Assert.assertTrue(smartBearWebOrdersPage.emptyOrdersMessage.isDisplayed());
    }
}
