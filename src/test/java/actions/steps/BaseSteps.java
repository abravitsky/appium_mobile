package actions.steps;

import aquality.appium.mobile.application.AqualityServices;
import projectscreens.abstracts.Alert;
import projectscreens.abstracts.HomeScreen;
import projectscreens.abstracts.ProductScreen;
import projectscreens.abstracts.SelectCityScreen;

public abstract class BaseSteps {
    protected static final ProductScreen productScreen = AqualityServices.getScreenFactory().getScreen(ProductScreen.class);
    protected static final HomeScreen homeScreen = AqualityServices.getScreenFactory().getScreen(HomeScreen.class);
    protected static final Alert alert = AqualityServices.getScreenFactory().getScreen(Alert.class);
    protected static final SelectCityScreen selectCityScreen = AqualityServices.getScreenFactory().getScreen(SelectCityScreen.class);
}