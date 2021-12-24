package projectscreens.ios;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;
import projectscreens.abstracts.ProductScreen;

@ScreenType(platform = PlatformName.IOS)
public class IOSProductScreen extends ProductScreen {
    public IOSProductScreen() {
        super(By.id("rlBasicInfo"), "Страница продукта");
    }
}
