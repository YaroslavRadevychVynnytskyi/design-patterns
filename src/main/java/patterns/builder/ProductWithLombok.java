package patterns.builder;

import java.math.BigDecimal;
import lombok.Builder;

@Builder
public class ProductWithLombok {
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer statusDictionaryValueId;
}
