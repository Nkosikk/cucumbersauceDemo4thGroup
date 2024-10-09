package Steps;

import Pages.UserTablePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("CHROME", "https://www.way2automation.com/angularjs-protractor/webtables/");
    UserTablePage userTablePage = PageFactory.initElements(driver, UserTablePage.class);


}
