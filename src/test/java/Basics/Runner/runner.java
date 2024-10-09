package Basics.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Basics/Features",
        glue = {"Basics/StepDefinition"},
        tags = "@login",
        plugin = {"pretty"},
        publish = true)
public class runner extends AbstractTestNGCucumberTests {
}
