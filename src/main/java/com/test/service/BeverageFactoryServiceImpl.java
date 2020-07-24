package com.test.service;

import com.test.constant.MenuItems;

import java.util.Map;

public class BeverageFactoryServiceImpl implements BeverageFactoryService {

    /*
     * (non-Javadoc) @see BeverageFactoryService#order(String)
     */
    public Double order(String menu) {
        String[] menuItemsArray = menu.split(",");

        Map<String, Double> menuItems = MenuItems.getMenuItems();
        Map<String, Double> ingredients = MenuItems.getIngredients();
        double price = 0;
        int exclusionCount = 0;
        for(String menuItem : menuItemsArray) {
            if(menuItems.containsKey(menuItem.trim())) {
                price += menuItems.get(menuItem.trim());
            } else if(ingredients.containsKey(menuItem.substring(2).trim())) {
                price -= ingredients.get(menuItem.substring(2).trim());
                exclusionCount++;
            }
        }

        if(exclusionCount == ingredients.size()) {
            throw new RuntimeException("An order cannot have all the ingredients in exclusion for a menu item.");
        }

        if(price <= 0) {
            throw new RuntimeException("Each order should have at least one menu item");
        }

        return price;
    }
}
