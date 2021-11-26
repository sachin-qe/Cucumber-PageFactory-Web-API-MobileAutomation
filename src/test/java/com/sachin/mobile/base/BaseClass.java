package com.sachin.mobile.base;

import com.sachin.mobile.PropertiesMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseClass {
    static AppiumDriver<MobileElement> driver;
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(BaseClass.class.getName());

    @BeforeTest
    public static AppiumDriver<MobileElement> setup() {
        LOG.info("this is a logger test: ");
        try {
            PropertiesMap propertiesMap = new PropertiesMap(System.getProperty("user.dir")+"/src/test/resources/config.properties");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, propertiesMap.getData("PLATFORM_NAME"));
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertiesMap.getData("PLATFORM_VERSION"));
            caps.setCapability(MobileCapabilityType.UDID, propertiesMap.getData("UDID"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, propertiesMap.getData("DEVICE_NAME"));
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, propertiesMap.getData("NEW_COMMAND_TIMEOUT"));
            caps.setCapability(MobileCapabilityType.APP, propertiesMap.getData("APP"));

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<>(url, caps);
        } catch (Exception exp) {
            LOG.error("Setup Error : ", exp);
        }
        return driver;
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    @AfterSuite
    public void shutDown(){
        driver.quit();
    }
}
