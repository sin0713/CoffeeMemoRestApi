package com.example.CoffeeMemoRestApi.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class RecipeModel {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "country", nullable = false)
    private String country;

    public Integer getId() {
        return this.id;
    }

    public String getCountry() {
        return this.country;
    }
}
