package tests;

import aquality.appium.mobile.application.AqualityServices;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static utils.LogUtils.infoLog;

public class BaseClass {

    @BeforeTest
    public void setUp() {
        infoLog("Запуск приложения");
        AqualityServices.getApplication();
//        driver.launchApp();

    }

    @AfterTest
    public void tearDown(){
        AqualityServices.getApplication().getDriver().quit();

    }
}
