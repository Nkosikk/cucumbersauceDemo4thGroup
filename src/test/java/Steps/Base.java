package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice,String url){

        switch (browserChoice.toLowerCase()){
            case "chrome":
                driver= new ChromeDriver();
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

}
