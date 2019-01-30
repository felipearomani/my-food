package com.github.felipearomani.myfood.model.repositories.food;

import com.github.felipearomani.myfood.model.entities.menuitem.projections.MenuItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FoodListRepository extends CrudRepository<com.github.felipearomani.myfood.model.entities.menuitem.MenuItem, Long> {

    @Query("SELECT f FROM MenuItem f")
    Page<MenuItem> getPaginatedFoods(Pageable pageable);
}
