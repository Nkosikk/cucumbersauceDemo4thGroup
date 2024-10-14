package Steps;

import Pages.AddUserPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class StepDef extends Base{

    @Given("The user table is displayed")
    public void the_user_table_is_displayed() {
        userTablePage.verifyThatUserTableIsDisplayed();
    }
    @And("The user click add user")
    public void the_user_click_add_user() {
        addUserPage.clickAddUser();

    }
    @And("The user validates that ad user screen is displayed")
    public void the_user_validates_that_ad_user_screen_is_displayed() {
        addUserPage.verifyAddUserTitle();

    }
    @And("The user enters firstName (.*)$")
    public void the_user_enters_first_name(String firstName) {
        addUserPage.enterFirstName(firstName);

    }

    @And("The user enters lastName (.*)$")
    public void the_user_enters_last_name(String lastName) {
        addUserPage.enterLastName(lastName);

    }

    @And("The user enters userName (.*)$")
    public void the_user_enters_user_name_user_name(String userName) {
        addUserPage.enterUseName(userName);

    }
    @And("The user enters password (.*)$")
    public void the_user_enters_password_password(String password) {
        addUserPage.enterPassword(password);

    }

    @And("The user select customer")
    public void the_user_select_customer() {
        addUserPage.selectCustomer();

    }

    @And("The user select a role")
    public void the_user_select_a_role() {
        addUserPage.selectRole();

    }

    @And("The user enters email (.*)$")
    public void the_user_enters_email_email(String email) {
        addUserPage.enterEmail(email);

    }

    @Given("The user enters cellPhone {int}")
    public void the_user_enters_cell_phone(Integer cellPhone) {
        addUserPage.enterCellPhone(String.valueOf(cellPhone));

    }

    @When("The user click save button")
    public void the_user_click_save_button() {
        addUserPage.clickSave();

    }

    @Then("A user is successful added to the table")
    public void a_user_is_successful_added_to_the_table() {
        userTablePage.verifyThatTheAddedUserIsDisplayed();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "image");
        }
    }


    @After
    public void closeBrowser(){
        driver.quit();
    }
}
