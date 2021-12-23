package aquality.appium.mobile.application;

import aquality.appium.mobile.application.Application;
import aquality.appium.mobile.application.ApplicationFactory;
import aquality.appium.mobile.application.AqualityServices;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.LocalFileDetector;

import java.net.URL;

public class RemoteApplicationFactory extends ApplicationFactory {

    @Override
    public Application getApplication() {
        URL serverUrl = AqualityServices.getApplicationProfile().getRemoteConnectionUrl();
        AppiumDriver driver = getDriver(serverUrl);
        driver.setFileDetector(new LocalFileDetector());
        logApplicationIsReady();
        return new Application(driver);
    }
}
