package projectscreens.android;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;
import projectscreens.abstracts.ProductScreen;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidProductScreen extends ProductScreen {
    public AndroidProductScreen() {
        super(By.id("rlBasicInfo"), "Страница продукта");
    }
}
