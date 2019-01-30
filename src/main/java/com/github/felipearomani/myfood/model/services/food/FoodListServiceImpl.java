package com.github.felipearomani.myfood.model.services.food;

import com.github.felipearomani.myfood.model.entities.menuitem.projections.MenuItem;
import com.github.felipearomani.myfood.model.exceptions.EmptyFoodsException;
import com.github.felipearomani.myfood.model.repositories.food.FoodListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FoodListServiceImpl implements FoodListService {

    private FoodListRepository foodListRepository;

    @Autowired
    public FoodListServiceImpl(FoodListRepository foodListRepository) {
        this.foodListRepository = foodListRepository;
    }

    @Override
    public Page<MenuItem> get(Pageable pageable) {
        Page<MenuItem> paginatedFoods = foodListRepository.getPaginatedFoods(pageable);

        if (paginatedFoods.getTotalElements() == 0) {
            throw new EmptyFoodsException();
        }

        return paginatedFoods;
    }
}
