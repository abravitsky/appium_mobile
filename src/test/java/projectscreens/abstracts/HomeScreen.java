package projectscreens.abstracts;

import aquality.appium.mobile.actions.TouchActions;
import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.ElementType;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import models.Product;
import org.openqa.selenium.By;

import java.util.List;
import java.util.NoSuchElementException;

import static utils.WaitUtils.waitingElementOnThePage;

public abstract class HomeScreen extends Screen {

    private TouchActions touchActions = new TouchActions();

    final private ILabel cityLabel = getElementFactory().getLabel(By.id("tvToolbarCity"),"Название города");
    final private IButton buttonBags = getElementFactory().getButton(By.id("imageView3"), "Кнопка сумок");
    final private ILabel railProduct = getElementFactory().getLabel(By.id("rlTop"), "Рельса товаров");

    static final private String GOODS_LOCATOR = "//*[contains(@resource-id,'rlBanner')]";

    protected HomeScreen(By locator, String name) {
        super(locator, name);
    }

    public void waitingForGoods(){
        waitingElementOnThePage(By.xpath(GOODS_LOCATOR));
    }

    public void clickButtonBags() {
        buttonBags.click();
    }

    public void clickCityLabel(){
        cityLabel.click();
    }

    public String getSelectedCity(){
        return cityLabel.getText();
    }

    public boolean isCityDisplayed(String city){
        return AqualityServices.getConditionalWait().waitFor(()->cityLabel.getText().equals(city));
    }

    public void swipeProducts() {
        waitingForGoods();
        touchActions.swipe(railProduct.getElement().getCenter(), railProduct.getElement().getLocation());
//        AqualityServices.getConditionalWait().waitFor(()->getElementFactory()
//                .findElements(By.xpath("//*[contains(@resource-id,'rlBanner')]"), ElementType.BUTTON)
//                .stream()
//                .findFirst()
//                .orElseThrow(()->new NoSuchElementException("Product not found"))
//                .state().waitForDisplayed());
//    }
    }

    public Product clickFirstProduct(){
        waitingForGoods();
        getElementFactory().getLabel(By.xpath("(//*[contains(@resource-id,'rlBanner')])[1]//*[contains(@resource-id,'tvSumm')]"),"цена");
        List<ILabel> goodsLabel = getElementFactory().findElements(By.xpath(GOODS_LOCATOR),"Список товаров",ElementType.LABEL);
        ILabel product = goodsLabel.stream()
                .findFirst()
                .orElseThrow(()->new NoSuchElementException("Product not found"));
        Product productModel = new Product();
        productModel.setPriceWithoutDiscount(product.findChildElement(By.xpath("//*[contains(@resource-id,'tvSumm')]"),"Цена без скидки",ElementType.LABEL).getText());
        productModel.setDiscountPrice(product.findChildElement(By.xpath("//*[contains(@resource-id,'tvPrice')]"),"Цена со скидкой",ElementType.LABEL).getText());
        productModel.setDiscount(product.findChildElement(By.xpath("//*[contains(@resource-id,'tvDiscount')]"),"Скидка",ElementType.LABEL).getText());
        product.click();
        return productModel;
    }

}
