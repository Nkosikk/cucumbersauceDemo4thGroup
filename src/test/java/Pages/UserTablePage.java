package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserTablePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'First Name')]")
    WebElement firstName_xpath;

    @FindBy(xpath = "//table//td[3]")
    WebElement userNameV_xpath;

    @FindBy(xpath = "//span[contains(.,'Last Name')]")
    WebElement lastName_xpath;

    @FindBy(xpath = "//span[contains(.,'Email')]")
    WebElement email_xpath;

    @FindBy(xpath = "//span[contains(.,'Role')]")
    WebElement role_xpath;

    @FindBy(xpath = "//table//td[contains(@class,'lastName')] | //table//td[4]")
    WebElement lastNameValue_xpath;

    @FindBy(xpath = "//table//td[contains(@class,'email')] | //table//td[5]")
    WebElement emailValue_xpath;

    @FindBy(xpath = "//table//td[contains(@class,'role')] | //table//td[6]")
    WebElement roleValue_xpath;

    public UserTablePage(WebDriver driver){
        this.driver=driver;
    }

    // public void verifyThatUserTableIsDisplayed(){
    //     new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(firstName_xpath));
    //     firstName_xpath.isDisplayed();
    // }

    // public void verifyThatTheAddedUserIsDisplayed() {
    //     new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userNameV_xpath));
    //     userNameV_xpath.isDisplayed();

    // }

    public boolean verifyThatUserTableIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(firstName_xpath));
            return firstName_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyThatTheAddedUserIsDisplayed() {
        try {
            // Consider using a more robust xpath like:
            // @FindBy(xpath = "//table//td[contains(@class, 'username')] or //table//td[3]")
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userNameV_xpath));
            return userNameV_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyLastNameColumnIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(lastName_xpath));
            return lastName_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyEmailColumnIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(email_xpath));
            return email_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyRoleColumnIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(role_xpath));
            return role_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyUserLastNameIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(lastNameValue_xpath));
            return lastNameValue_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyUserEmailIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(emailValue_xpath));
            return emailValue_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyUserRoleIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(roleValue_xpath));
            return roleValue_xpath.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
