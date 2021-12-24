package utils;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static void waitingElementOnThePage(By locator){
        WebDriverWait wait = new WebDriverWait(AqualityServices.getApplication().getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static boolean waitingElement(By locator){
        WebDriverWait wait = new WebDriverWait(AqualityServices.getApplication().getDriver(),20);
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return webElement.isEnabled();
    }

}
