package actions.steps;

import com.epam.reportportal.annotations.Step;
import models.Product;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class HomeSteps extends BaseSteps {

    @Step("Выбрать город")
    public void chooseCity(String city){
        homeScreen.clickCityLabel();
        alert.tapOk();
        selectCityScreen.sendCity(city);
    }

    @Step("Проверить что нужный город отображается")
    public void assertCityIsDisplayed(String city){
        assertTrue(homeScreen.isCityDisplayed(city),"Город не соответствует выбранному");
    }

    @Step("Выбрать первый продукт из списка")
    public Product chooseFirstProduct(){
       return homeScreen.clickFirstProduct();
    }
}
