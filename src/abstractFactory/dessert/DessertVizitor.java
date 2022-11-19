package abstractFactory.dessert;

import abstractFactory.Vizitor;

public class DessertVizitor implements Vizitor {
    @Override
    public void makeOrder() {
        System.out.println("Make Dessert");
    }
}
