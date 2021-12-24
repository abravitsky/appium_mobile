package projectscreens.abstracts;

import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class SelectCityScreen extends Screen {

    protected SelectCityScreen(By locator, String name) {
        super(locator, name);
    }

    public void sendCity(String city){
    }
}
