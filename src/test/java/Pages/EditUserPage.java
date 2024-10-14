package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class EditUserPage {

    private final WebDriver driver;
    @FindBy(xpath = "//label[contains(.,'Company BBB')]")
    WebElement newCustomerType_xpath;

    @FindBy(xpath = "//select[@name='RoleId']")
    WebElement userRole_xpath;

    @FindBy(xpath = "//input[@name='Mobilephone']")
    WebElement cellNumber_xpath;

    @FindBy(xpath = "//button[contains(.,'Save')]")
    WebElement save_xpath;

    @FindBy(xpath = "(//button[contains(.,'Edit')])[1]")
    WebElement editOption_xpath;

    @FindBy(xpath = "//h3[contains(.,'Edit User')]")
    WebElement editTitle_xpath;

    @FindBy(xpath = "(//input[@name='IsLocked']")
    WebElement lockUserProfile_xpath;

    public EditUserPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickSaveUpdateButton() {
        save_xpath.click();
    }

    public void clickEditOption() {
        editOption_xpath.click();
    }

    public void verifyThatEditTitleIsDisplayed() {
        editTitle_xpath.isDisplayed();
    }

    public void lockUserProfile(String lockUser) {
        lockUserProfile_xpath.sendKeys(lockUser);
    }

    public void updateCustomerType() {
        newCustomerType_xpath.click();
    }

    public void updateUserRole(String newUserRole) {
        new WebDriverWait(driver, Duration.ofSeconds(20));
        userRole_xpath.sendKeys(newUserRole);
    }

//    public void lockDownUserProfile(String profileLockeDown) {
//        lockUserProfile_xpath.sendKeys(profileLockeDown);
//    }

}
