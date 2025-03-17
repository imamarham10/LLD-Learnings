package foodDeliverySystem.filters;

import foodDeliverySystem.apis.data.FoodItem;
import foodDeliverySystem.apis.data.StarRating;

public class StarRatingFilter implements FoodItemFilter{
    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getStarRating().getVal() >= starRating.getVal();
    }
}
