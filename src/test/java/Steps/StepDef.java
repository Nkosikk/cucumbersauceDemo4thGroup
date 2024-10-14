package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class StepDef extends Base {

    @Given("The user table is displayed")
    public void the_user_table_is_displayed() {
        userTablePage.verifyThatUserTableIsDisplayed();
    }

    @And("The user click add user")
    public void the_user_click_add_user() {
        userTablePage.clickAddUserButton();

    }

    @And("The user validates that ad user screen is displayed")
    public void the_user_validates_that_ad_user_screen_is_displayed() {
        addUserPage.verifyThatAddUserHeadingIsDisplayed();
    }

    @And("The user enters firstName (.*)$")
    public void the_user_enters_first_name(String name) {
        addUserPage.enterFirstName(name);
    }


    @And("The user enters lastName (.*)$")
    public void theUserEntersLastName(String lName) {
        addUserPage.enterLastName(lName);
    }


    @And("The user enters username (.*)$")
    public void theUserEntersUsername(String uName) {
        addUserPage.enterUserName(uName);
    }


    @And("The user enters password (.*)$")
    public void theUserEntersPassword(String password) {
        addUserPage.enterPassword(password);
    }

    @And("The user selects customer type")
    public void theUserSelectsCustomerType() {
        addUserPage.selectCustomerType();
    }

    @And("The user selects user role (.*)$")
    public void theUserSelectsUserRole(String userRole) {
        addUserPage.selectuserRole(userRole);
    }

    @And("The user enters email address (.*)$")
    public void theUserEntersEmailAddress(String emailAddress) {
        addUserPage.enterEmailAddress(emailAddress);
    }

    @And("The user enters cell phone number (.*)$")
    public void theUserEntersCellPhoneNumber(String cellNumber) {
        addUserPage.entercellNumber(cellNumber);
    }


    @And("The user click the save button")
    public void theUserClickTheSaveButton() {
        addUserPage.clickSaveButton();
    }


    @And("The user click the edit option to update the user record")
    public void theUserClickTheEditOptionToUpdateTheUserRecord() {
        editUserPage.clickEditOption();
    }

    @And("The user validate that edit user screen is displayed")
    public void theUserValidateThatEditUserScreenIsDisplayed() {
        editUserPage.verifyThatEditTitleIsDisplayed();
    }

    @And("The user update profile by changing customer")
    public void theUserUpdateProfileByChangingCustomer() {
        editUserPage.updateCustomerType();
    }

    @And("The user update profile by changing role (.*)$")
    public void theUserUpdateProfileByChangingRoleNewUserRole(String newUserRole) {
        editUserPage.updateUserRole(newUserRole);
    }


    //    @And("The user update profile by locking it down (.*)$")
//    public void theUserUpdateProfileByLockingItDownUserProfileLockedDown(String profileLockedDown) {
//        editUserPage.lockUserProfile(profileLockedDown);
//    }
    @And("The user click the save button to save updates")
    public void theUserClickTheSaveButtonToSaveUpdates() {
        editUserPage.clickSaveUpdateButton();
    }

    @After
    public void closeBrowser() {
        //driver.quit();
    }
}
