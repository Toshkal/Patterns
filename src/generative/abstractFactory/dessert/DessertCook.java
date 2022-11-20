package generative.abstractFactory.dessert;

import generative.abstractFactory.Cook;

public class DessertCook implements Cook {
    @Override
    public void cookingOrder() {
        System.out.println("Cooking Dessert");
    }
}
