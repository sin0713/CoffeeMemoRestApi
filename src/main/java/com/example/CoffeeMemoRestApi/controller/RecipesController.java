package com.example.CoffeeMemoRestApi.controller;

import com.example.CoffeeMemoRestApi.data.entity.RecipeModel;
import com.example.CoffeeMemoRestApi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RecipesController {
    @Autowired
    RecipeService service;

    @GetMapping("/recipes")
    public List<RecipeModel> getAllRecipes() {
        List<RecipeModel> list = service.getAllRecipes();
        return list;
    }
}
