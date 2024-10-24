package Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

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

    @FindBy(xpath = "//input[@value='16']")
    WebElement customerRadioButton_xpath;

    @FindBy(name = "RoleId")
    WebElement role_name;

    @FindBy(xpath = "//input[@name='Email']")
    WebElement email_xpath;

    @FindBy(xpath = "//input[@name='Mobilephone']")
    WebElement cellPhone_xpath;

    @FindBy(xpath = "//button[contains(.,'Save')]")
    WebElement saveButton_xpath;


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
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000);
        String newUserName = userName + randomNumber;
        userName_xpath.sendKeys(newUserName);

    }

    public void enterPassword(String password) {
        password_xpath.sendKeys(password);

    }

    public void selectCustomer() {
        customerRadioButton_xpath.click();

    }

    public void selectRole(){
        Select dropdown = new Select(role_name);
        dropdown.selectByVisibleText("Sales Team");

    }

    public void enterEmail(String email) {
        email_xpath.sendKeys(email);

    }

    public void enterCellPhone(String cellPhone) {
        cellPhone_xpath.sendKeys(cellPhone);

    }

    public void clickSave() {
        saveButton_xpath.click();

    }


}
