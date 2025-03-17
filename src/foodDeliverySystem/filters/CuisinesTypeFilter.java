package foodDeliverySystem.filters;

import foodDeliverySystem.apis.data.CuisineType;
import foodDeliverySystem.apis.data.FoodItem;

import java.util.List;

public class CuisinesTypeFilter implements FoodItemFilter{
    private final List<CuisineType> cuisineType;

    public CuisinesTypeFilter(List<CuisineType> cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return cuisineType.contains(foodItem.getCuisineType());
    }
}
