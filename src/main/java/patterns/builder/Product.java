package patterns.builder;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer statusDictionaryValueId;

    public Product(String name, BigDecimal price, Integer quantity, Integer statusDictionaryValueId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.statusDictionaryValueId = statusDictionaryValueId;
    }

    public static class ProductBuilder {
        private String name;
        private BigDecimal price;
        private Integer quantity;
        private Integer statusDictionaryValueId;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ProductBuilder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductBuilder statusDictionaryValueId(Integer statusDictionaryValueId) {
            this.statusDictionaryValueId = statusDictionaryValueId;
            return this;
        }

        public Product build() {
            return new Product(this.name, this.price, this.quantity, this.statusDictionaryValueId);
        }
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n"
                + "Price: " + this.price + "\n"
                + "Quantity: " + this.quantity + "\n"
                + "Status: " + this.statusDictionaryValueId;
    }
}