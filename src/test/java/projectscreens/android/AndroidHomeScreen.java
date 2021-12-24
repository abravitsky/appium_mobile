package projectscreens.android;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;
import projectscreens.abstracts.HomeScreen;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidHomeScreen extends HomeScreen {
    public AndroidHomeScreen() {
        super(By.id("action_bar_root"), "Домашняя страница");
    }

//    final private List<IButton> products =  getElementFactory().findElements(By.xpath("//*[contains(@resource-id,'rlBanner')]"),ElementType.BUTTON);

}
