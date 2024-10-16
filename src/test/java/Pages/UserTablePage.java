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

    @FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[3]")
    WebElement userNameV_xpath;

    public UserTablePage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyThatUserTableIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(firstName_xpath));
        firstName_xpath.isDisplayed();
    }

    public void verifyThatTheAddedUserIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(userNameV_xpath));
        userNameV_xpath.isDisplayed();

    }


}
