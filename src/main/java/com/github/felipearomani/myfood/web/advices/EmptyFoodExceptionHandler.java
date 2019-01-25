package com.github.felipearomani.myfood.web.advices;

import com.github.felipearomani.myfood.model.exceptions.EmptyFoodsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class EmptyFoodExceptionHandler {

    @ExceptionHandler(EmptyFoodsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handler(EmptyFoodsException ex) {}
}
