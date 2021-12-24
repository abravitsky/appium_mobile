package tests;

import actions.steps.HomeSteps;
import actions.steps.ProductSteps;
import models.Product;
import org.springframework.lang.NonNull;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static utils.StringUtils.leaveNumbers;

public class TestClass extends BaseClass{

    private static final HomeSteps homeSteps = new HomeSteps();
    private static final ProductSteps productSteps = new ProductSteps();

    private String city;

    @BeforeClass
    @Parameters({"city"})
    public void readParams(@NonNull String city) {
        this.city = city;
    }

    @Test
    public void run(){
        homeSteps.chooseCity(city);
        homeSteps.assertCityIsDisplayed(city);
        Product productPricesFirst = homeSteps.chooseFirstProduct();
        productSteps.assertProductPageIsOpened();
        Product productPricesSecond = productSteps.getPricesProduct();
        Assert.assertEquals(leaveNumbers(productPricesFirst.getPriceWithoutDiscount()),leaveNumbers(productPricesSecond.getPriceWithoutDiscount()),"Цена без скидки различается");
        Assert.assertEquals(leaveNumbers(productPricesFirst.getDiscountPrice()),leaveNumbers(productPricesSecond.getDiscountPrice()),"Цена со скидкой различается");
        Assert.assertEquals(productPricesFirst.getDiscount(),productPricesSecond.getDiscount(),"Скидка различается");
        System.out.println("e boy");
    }
}
