package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUserPage {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(.,'Add User')]")
    WebElement addUserButton_xpath;

    @FindBy(xpath = "//h3[contains(.,'Add User')]")
    WebElement addUserTitle_xpath;

    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement firstName_xpath;

    @FindBy(xpath = "//input[@name='LastName']")
    WebElement lastName_xpath;

    @FindBy(xpath = "//input[@name='UserName']")
    WebElement userName_xpath;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement password_xpath;

    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddUser() {
        addUserButton_xpath.click();
    }

    public void verifyAddUserTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addUserTitle_xpath));
        addUserTitle_xpath.isDisplayed();
    }

    public void enterFirstName(String firstName) {
        firstName_xpath.sendKeys(firstName);

    }

    public void enterLastName(String lastName) {
        lastName_xpath.sendKeys(lastName);

    }

    public void enterUseName(String userName) {
        userName_xpath.sendKeys(userName);

    }

    public void enterPassword(String password) {
        userName_xpath.sendKeys(password);

    }

}
