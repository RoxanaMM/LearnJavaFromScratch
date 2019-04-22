package designPatterns.creational.builder.firstExample;

public class TestTheBuilderPattern {

    public static void main (String []args){
        NutritionFacts.Builder nutritionFacts = new NutritionFacts.Builder(1,2)
                .calories(12).carbohydrate(12);

      //  List<String>strings = Lists.newArrayList()
    }
}
