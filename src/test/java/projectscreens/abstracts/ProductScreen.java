package projectscreens.abstracts;

import aquality.appium.mobile.actions.SwipeDirection;
import aquality.appium.mobile.actions.TouchActions;
import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import models.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import utils.WaitUtils;

public abstract class ProductScreen extends Screen {

    TouchActions touchActions = new TouchActions();

    final private ILabel productInfo = getElementFactory().getLabel(By.id("rlBasicInfo"),"Раздел информации о продукте");
    final private ILabel discount = getElementFactory().getLabel(By.id("tvAdditionalDiscount"),"Скидка товара");
    final private ILabel discountPrice = getElementFactory().getLabel(By.id("tvAdditionalPrice"),"Цена товара со скидкой");
    final private ILabel priceWithoutDiscount = getElementFactory().getLabel(By.id("tvAdditionalOriginal"),"Цена товара без скидки");
    final private ILabel actionBar = getElementFactory().getLabel(By.id("action_bar_root"),"Страница продукта");

    protected ProductScreen(By locator, String name) {
        super(locator, name);
    }

    public boolean productInfoIsDisplayed(){
        WaitUtils.waitingElementOnThePage(By.id("rlBasicInfo"));
        return productInfo.state().isDisplayed();
    }

    public Product getProductPrice(){
        discount.getTouchActions().scrollToElement(SwipeDirection.DOWN);
        Product product = new Product();
        product.setDiscount(discount.getText());
        product.setDiscountPrice(discountPrice.getText());
        product.setPriceWithoutDiscount(priceWithoutDiscount.getText());
        return product;
    }
}
