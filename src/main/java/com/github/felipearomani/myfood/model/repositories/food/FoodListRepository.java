package com.github.felipearomani.myfood.model.repositories.food;

import com.github.felipearomani.myfood.model.entities.food.Food;
import com.github.felipearomani.myfood.model.entities.food.FoodProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FoodListRepository extends CrudRepository<Food, Long> {

    @Query("SELECT f FROM Food f")
    Page<FoodProjection> getPaginatedFoods(Pageable pageable);
}
