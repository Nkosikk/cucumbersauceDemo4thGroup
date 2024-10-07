package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class steps {
    WebDriver driver;

    @Given("I am in the login page")
    public void i_am_in_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

    @And("I enter username (.*)$")
    public void i_enter_username_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I enter password (.*)$")
    public void i_enter_password_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.name("login-button")).click();
    }

    @Then("The home page is displayed")
    public void the_home_page_is_displayed() {
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).isDisplayed();
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
