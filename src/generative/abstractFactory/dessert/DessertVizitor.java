package generative.abstractFactory.dessert;

import generative.abstractFactory.Vizitor;

public class DessertVizitor implements Vizitor {
    @Override
    public void makeOrder() {
        System.out.println("Make Dessert");
    }
}
