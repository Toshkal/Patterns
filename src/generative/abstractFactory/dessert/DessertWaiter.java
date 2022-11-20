package generative.abstractFactory.dessert;

import generative.abstractFactory.Waiter;

public class DessertWaiter implements Waiter {
    @Override
    public void acceptedOrder() {
        System.out.println("Accepted Dessert");
    }
}
