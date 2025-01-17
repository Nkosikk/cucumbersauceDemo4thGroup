package Utils;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice,String url){

        switch (browserChoice.toLowerCase()){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless");
                driver= new ChromeDriver(options);
                break;
            case "firefox":
            case "mozila":
                driver= new FirefoxDriver();
            default:
                driver= new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeBrowser(){
        if (driver != null) {  // Add null check for safety
            driver.quit();
            driver = null;  // Clear the reference
        }
    }

}
