package patterns.builder;

import java.math.BigDecimal;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Product> products = buildProducts();
    }

    public static List<Product> buildProducts() {
        Product product1 = new Product.ProductBuilder()
                .name("Dell P2314H")
                .price(BigDecimal.valueOf(8_999))
                .quantity(99)
                .statusDictionaryValueId(800)
                .build();

        Product product2 = Product.builder()
                .name("Apple iMac Pro")
                .price(BigDecimal.valueOf(65_100))
                .quantity(12)
                .statusDictionaryValueId(800)
                .build();

        ProductWithLombok product3 = ProductWithLombok.builder()
                .name("HP ZBook 14")
                .price(BigDecimal.valueOf(25_000))
                .quantity(25)
                .statusDictionaryValueId(801)
                .build();

        return List.of(product1, product2);
    }
}
