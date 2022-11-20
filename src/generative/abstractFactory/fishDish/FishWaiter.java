package generative.abstractFactory.fishDish;

import generative.abstractFactory.Waiter;

public class FishWaiter implements Waiter {
    @Override
    public void acceptedOrder() {
        System.out.println("Accepted Fish");
    }
}
