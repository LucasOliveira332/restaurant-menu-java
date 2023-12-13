package com.example.RestaurantMenu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestaurantMenu.food.FoodRepository;
import com.example.RestaurantMenu.food.Food;

@RestController
@RequestMapping("food")
public class FoodController {
  @Autowired
  private FoodRepository repository;
  @GetMapping
  public List<Food> Get(){

    List<Food> foodList = repository.findAll();
    return foodList;
  }
} 