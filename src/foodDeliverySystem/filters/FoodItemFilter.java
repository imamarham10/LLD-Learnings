package foodDeliverySystem.filters;

import foodDeliverySystem.apis.data.FoodItem;

public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}
