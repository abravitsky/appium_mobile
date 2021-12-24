package projectscreens.android;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import projectscreens.abstracts.SelectCityScreen;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidSelectCityScreen extends SelectCityScreen {

    public AndroidSelectCityScreen() {
        super(By.id("action_bar_root"), "Страница выбора города");
    }

    final private ILabel searchCity = getElementFactory().getLabel(By.id("etSearchTest"),"Поиск города");
    final private IButton clickCity = getElementFactory().getButton(By.xpath("(//*[contains(@resource-id,'tvCityItemName')])[1]"),"Первый город");

    public void sendCity(String city){
        searchCity.sendKeys(city);
        clickCity.click();
    }
}
