package abstractFactory.dessert;

import abstractFactory.Cook;

public class DessertCook implements Cook {
    @Override
    public void cookingOrder() {
        System.out.println("Cooking Dessert");
    }
}
