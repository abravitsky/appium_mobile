package models;

import lombok.Data;

@Data
public class Product {
    private String priceWithoutDiscount;

    private String discountPrice;

    private String discount;
}
