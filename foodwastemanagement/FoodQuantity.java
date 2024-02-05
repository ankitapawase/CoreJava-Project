package foodwastemanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//class Food {
//    String foodName;
//    int quantity;
//    String dob;
//
//    public Food(String foodName, int quantity, String dob) {
//        this.foodName = foodName;
//        this.quantity = quantity;
//        this.dob = dob;
//    }
//
//    @Override
//    public String toString() {
//        return "Food [foodName=" + foodName + ", quantity=" + quantity + ", dob=" + dob + "]";
//    }
//}

public class FoodQuantity {

    public static List<Object> sumFruitQuantities(List<Food> input) {
        Map<String, Map<String, Integer>> fruitQuantities = new HashMap<>();

        // Iterate through the input list and sum up the quantities for each fruit and date
        for (Food food : input) {
            String fruit = food.foodName;
            String date = food.dob;
            int quantity = food.quantity;

            fruitQuantities
                    .computeIfAbsent(fruit, k -> new HashMap<>())
                    .put(date, fruitQuantities.getOrDefault(fruit, new HashMap<>()).getOrDefault(date, 0) + quantity);
        }

        // Create the output list with summed quantities
        List<Object> output = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> fruitEntry : fruitQuantities.entrySet()) {
            String fruit = fruitEntry.getKey();
            Map<String, Integer> dateQuantities = fruitEntry.getValue();

            for (Map.Entry<String, Integer> entry : dateQuantities.entrySet()) {
                List<Object> outputEntry = new ArrayList<>();
                outputEntry.add(fruit);
                outputEntry.add(entry.getKey());  // Date
                outputEntry.add(entry.getValue()); // Quantity
                output.add(outputEntry);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Food> foodList = new ArrayList<>();

        foodList.add(new Food("Apple", 1, "12-12-2000"));
        foodList.add(new Food("Banana", 4, "12-12-2000"));
        foodList.add(new Food("Mango", 12, "12-12-2000"));
        foodList.add(new Food("Apple", 6, "12-12-2000"));
        foodList.add(new Food("Mango", 1, "12-12-2000"));

        List<Object> output = sumFruitQuantities(foodList);

        // Print the header
        System.out.println("Name\t||\tDate\t||\tQuantity");
        System.out.println("----------------------------------------");

        // Print the output
        for (Object entry : output) {
            List<Object> outputEntry = (List<Object>) entry;
            System.out.println(outputEntry.get(0) + "\t||\t" + outputEntry.get(1) + "\t||\t" + outputEntry.get(2));
        }
    }
}
