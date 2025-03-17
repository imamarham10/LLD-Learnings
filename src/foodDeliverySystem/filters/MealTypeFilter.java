package foodDeliverySystem.filters;

import foodDeliverySystem.apis.data.FoodItem;
import foodDeliverySystem.apis.data.MealType;

public class MealTypeFilter implements FoodItemFilter{
    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType().equals(mealType);
    }
}
