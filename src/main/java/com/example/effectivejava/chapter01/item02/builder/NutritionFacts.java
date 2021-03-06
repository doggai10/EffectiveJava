package com.example.effectivejava.chapter01.item02.builder;

public class NutritionFacts {

    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbonhydrate;

    public static class Builder{

        private final int servingSize;

        private final int servings;

        private int calories = 0;

        private int fat = 0;

        private int sodium = 0;

        private int carbonhydrate =0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories=val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium=val;
            return this;
        }

        public Builder carbonhydrate(int val) {
            carbonhydrate=val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat =builder.fat;
        sodium = builder.sodium;
        carbonhydrate = builder.carbonhydrate;
    }
}
