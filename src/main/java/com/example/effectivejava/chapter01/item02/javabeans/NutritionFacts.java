package com.example.effectivejava.chapter01.item02.javabeans;

public class NutritionFacts {

    private int servingSize = -1;

    private int servings = -1;

    private int calories = 0;

    private int fat = 0;

    private int sodium = 0;

    private int carbonhydrate =0;

    public NutritionFacts() {}

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbonhydrate(int carbonhydrate) {
        this.carbonhydrate = carbonhydrate;
    }
}
