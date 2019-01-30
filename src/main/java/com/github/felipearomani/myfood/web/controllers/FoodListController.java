package com.github.felipearomani.myfood.web.controllers;

import com.github.felipearomani.myfood.model.entities.menuitem.projections.MenuItem;
import com.github.felipearomani.myfood.model.services.food.FoodListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodListController {

    private FoodListService foodListService;

    @Autowired
    public FoodListController(FoodListService foodListService) {
        this.foodListService = foodListService;
    }

    @GetMapping("/foods")
    private ResponseEntity<Page<MenuItem>> getList(Pageable pageable) {
        Page<MenuItem> foodListProjections = foodListService.get(pageable);
        return new ResponseEntity<>(foodListProjections, HttpStatus.OK);
    }
}
