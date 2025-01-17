package Steps;

import Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
    @After
    public void tearDown(Scenario scenario) {
        BrowserFactory.closeBrowser();
    }
}
