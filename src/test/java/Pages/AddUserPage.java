package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class AddUserPage {
    @FindBy(xpath = "//h3[contains(.,'Add User')]")
    WebElement addUserHeading_xpath;

    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement firstName_xpath;

    @FindBy(xpath = "//input[@name='LastName']")
    WebElement lastName_xpath;

    @FindBy(xpath = "//input[@name='UserName']")
    WebElement userName_xpath;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement password_xpath;

    @FindBy(xpath = "//label[contains(.,'Company AAA')]")
    WebElement customerType_xpath;

    @FindBy(xpath = "//label[contains(.,'Company BBB')]")
    WebElement newCustomerType_xpath;

    @FindBy(xpath = "//select[@name='RoleId']")
    WebElement userRole_xpath;

    @FindBy(xpath = "//input[@name='Email']")
    WebElement emailAddress_xpath;

    @FindBy(xpath = "//input[@name='Mobilephone']")
    WebElement cellNumber_xpath;

    @FindBy(xpath = "//button[contains(.,'Save')]") WebElement save_xpath;

    @FindBy(xpath = "(//button[contains(.,'Edit')])[1]") WebElement editOption_xpath;

    @FindBy(xpath = "//h3[contains(.,'Edit User')]") WebElement editTitle_xpath;

    @FindBy(xpath = "(//input[@name='IsLocked'])[8]") WebElement lockUserProfile_xpath;

//    public AddUserPage(WebDriver driver){
//        this.driver=driver;
//    }

    public void verifyThatAddUserHeadingIsDisplayed() {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(firstName_xpath));
        addUserHeading_xpath.isDisplayed();
    }

    public void enterFirstName(String name) {
        firstName_xpath.sendKeys(name);
    }

    public void enterLastName(String lName) {
        lastName_xpath.sendKeys(lName);
    }

    String randomUserName;
    Random rand = new Random();

    public void enterUserName(String uName) {

        randomUserName = uName.concat(String.valueOf(rand.nextInt(100))).concat("@gmail.com");
        userName_xpath.sendKeys(randomUserName);
    }


    public void enterPassword(String password) {
        password_xpath.sendKeys(password);
    }

    public void selectCustomerType() {
        customerType_xpath.click();
    }

    public void selectuserRole(String userRole) {
        userRole_xpath.sendKeys(userRole);
    }

    public void enterEmailAddress(String emailAddress) {
        emailAddress_xpath.sendKeys(emailAddress);
    }

    public void entercellNumber(String cellNumber) {
        cellNumber_xpath.sendKeys(cellNumber);
    }

    public void clickSaveButton() {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(firstName_xpath));
        save_xpath.click();
    }

    public void clickEditOption() {
        editOption_xpath.click();
    }

    public void verifyThatEditTitleIsDisplayed() {
        editTitle_xpath.isDisplayed();
    }
}
