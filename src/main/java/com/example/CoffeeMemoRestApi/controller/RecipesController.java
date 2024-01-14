package com.example.CoffeeMemoRestApi.controller;

import com.example.CoffeeMemoRestApi.data.entity.RecipeModel;
import com.example.CoffeeMemoRestApi.request.PostRecipeParam;
import com.example.CoffeeMemoRestApi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/recipes")
public class RecipesController {
    @Autowired
    RecipeService service;

    // 一覧取得
    @GetMapping
    public List<RecipeModel> getAllRecipes() {
        List<RecipeModel> list = service.getAllRecipes();
        return list;
    }
    @GetMapping("/{id}")
    public RecipeModel getItem(@PathVariable String id) {
        return service.getRecipeById(id);
    }

    @PostMapping
    public RecipeModel insertRecipe(@RequestBody PostRecipeParam param) {
        RecipeModel recipe;

        try {
            recipe = service.insert(param.getCountry());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return recipe;
    }


    // todo 更新

    // todo 削除
}
