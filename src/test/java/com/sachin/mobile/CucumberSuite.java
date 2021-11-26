package com.sachin.mobile;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
//        glue = "com.sachin.mobile.steps",
        glue ="com/sachin/mobile/steps",
//        features = "src/test/resources/mobile-features",
        features = "classpath:mobile-features",
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "pretty", "html:target/html-reports/report.html"},
        monochrome = true
//        tags = "@Test"
)
public class CucumberSuite extends AbstractTestNGCucumberTests {
}
