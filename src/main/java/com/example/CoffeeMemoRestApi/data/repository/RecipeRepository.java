package com.example.CoffeeMemoRestApi.data.repository;

import com.example.CoffeeMemoRestApi.data.entity.RecipeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipeModel, Integer> {
}
