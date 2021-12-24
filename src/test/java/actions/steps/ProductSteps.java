package actions.steps;

import com.epam.reportportal.annotations.Step;
import models.Product;

import static org.testng.Assert.assertTrue;

public class ProductSteps extends BaseSteps{

    @Step("Проверить что страница открыта")
    public void assertProductPageIsOpened(){
        assertTrue(productScreen.productInfoIsDisplayed(),"Страница продукта не открыта");
    }

    @Step("Получить цены продукта")
    public Product getPricesProduct(){
        return productScreen.getProductPrice();
    }
}
