package designPatterns.creational.builder.firstExample;

public final class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public final static class Builder{

        //required
        private final int servingSize;
        private final int servings;

        //not required
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingsSize, int servings){
            this.servings = servings;
            this.servingSize = servingsSize;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    //it's a kind of a composition used instead of a constructor
    //traditional calling
    public NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
