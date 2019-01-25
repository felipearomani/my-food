package com.github.felipearomani.myfood.model.entities.food;

import java.math.BigDecimal;

public interface FoodProjection {
    String getId();
    String getName();
    String getDescription();
    BigDecimal getPrice();
}
