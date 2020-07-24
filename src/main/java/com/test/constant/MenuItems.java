package com.test.constant;

import java.util.HashMap;
import java.util.Map;

public class MenuItems {
    private static Map<String, Double> menuItems;
    private static Map<String, Double> ingredients;

    public static Map<String, Double> getMenuItems() {
        menuItems = new HashMap<>();
        menuItems.put("Chai", 4.0);
        menuItems.put("Coffee", 5.0);
        menuItems.put("Banana Smoothie", 6.0);
        menuItems.put("Strawberry Shake", 7.0);
        menuItems.put("Mojito", 7.5);

        return menuItems;
    }
    public static Map<String, Double> getIngredients() {
        ingredients = new HashMap<>();

        ingredients.put("water", 0.5);
        ingredients.put("mint", 0.5);
        ingredients.put("soda", 0.5);
        ingredients.put("sugar", 0.5);
        ingredients.put("milk", 1.0);

        return ingredients;
    }
}
