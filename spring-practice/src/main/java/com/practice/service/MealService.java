package com.practice.service;

import com.practice.model.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {
    List<Meal> mealList = new ArrayList<>();
    public MealService(List<Meal> mealList){
        this.mealList.add(new Meal("hamburger",1000,"This is nice"));
    }

    public Meal getMealByName(String name){
        for(int i = 0; i<this.mealList.size();i++){
            if(this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.mealList.get(i);
            }
        }
        return null;
    }
}
