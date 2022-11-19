package abstractFactory.fishDish;

import abstractFactory.Waiter;

public class FishWaiter implements Waiter {
    @Override
    public void acceptedOrder() {
        System.out.println("Accepted Fish");
    }
}
