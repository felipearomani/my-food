package com.github.felipearomani.myfood.model.services.food;

import com.github.felipearomani.myfood.model.entities.food.FoodProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FoodListService {
    Page<FoodProjection> get(Pageable pageable);
}
