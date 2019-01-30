package com.github.felipearomani.myfood.model.services.food;

import com.github.felipearomani.myfood.model.entities.menuitem.projections.MenuItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FoodListService {
    Page<MenuItem> get(Pageable pageable);
}
