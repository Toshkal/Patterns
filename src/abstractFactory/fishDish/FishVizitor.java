package abstractFactory.fishDish;

import abstractFactory.Vizitor;

public class FishVizitor implements Vizitor {
    @Override
    public void makeOrder() {
        System.out.println("Make Fish");
    }
}
