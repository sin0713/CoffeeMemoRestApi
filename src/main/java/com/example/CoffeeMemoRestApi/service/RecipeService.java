package com.example.CoffeeMemoRestApi.service;

import com.example.CoffeeMemoRestApi.data.entity.RecipeModel;
import com.example.CoffeeMemoRestApi.data.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository repository;

    public List<RecipeModel> getAllRecipes() {
        return repository.findAll();
    }
}
