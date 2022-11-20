package generative.abstractFactory.fishDish;

import generative.abstractFactory.Cook;

public class FishCook implements Cook {
    @Override
    public void cookingOrder() {
        System.out.println("Cooking Fish");
    }
}
