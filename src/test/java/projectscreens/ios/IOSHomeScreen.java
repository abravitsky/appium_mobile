package projectscreens.ios;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;
import projectscreens.abstracts.HomeScreen;

@ScreenType(platform = PlatformName.IOS)
public class IOSHomeScreen extends HomeScreen {
    public IOSHomeScreen(By locator, String name) {
        super(By.id("action_bar_root"), "Home screen");
    }


}
