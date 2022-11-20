package generative.abstractFactory.fishDish;

import generative.abstractFactory.Chef;
import generative.abstractFactory.Cook;
import generative.abstractFactory.Vizitor;
import generative.abstractFactory.Waiter;

public class FishTeamFactory implements Chef {
    @Override
    public Cook getCook() {
        return new FishCook();
    }

    @Override
    public Waiter getWaiter() {
        return new FishWaiter();
    }

    @Override
    public Vizitor getVizitor() {
        return new FishVizitor();
    }
}
