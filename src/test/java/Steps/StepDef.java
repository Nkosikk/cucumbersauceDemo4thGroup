package Steps;

import Pages.AddUserPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

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

    @And("The user select customer Company BBB")
    public void the_user_select_customer_company_bbb() {
        addUserPage.selectCustomer();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
