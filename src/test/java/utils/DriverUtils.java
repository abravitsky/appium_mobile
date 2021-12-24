package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static utils.ConfigProperties.getConfigProperties;
import static utils.TestProperties.getTestProperties;

public class DriverUtils {
    private static WebDriver driver;

    private DriverUtils() { }

    public static WebDriver getDriver() {
        if(driver == null){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME,getConfigProperties("deviceName"));
            caps.setCapability(CapabilityType.PLATFORM_NAME,getConfigProperties("platformName"));
            caps.setCapability("app",getTestProperties("pathApp"));
            try {
                driver = new AppiumDriver<>(new URL(getConfigProperties("urlAppium")), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }
}
