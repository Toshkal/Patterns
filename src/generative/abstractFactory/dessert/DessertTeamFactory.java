package generative.abstractFactory.dessert;

import generative.abstractFactory.Chef;
import generative.abstractFactory.Cook;
import generative.abstractFactory.Vizitor;
import generative.abstractFactory.Waiter;

public class DessertTeamFactory implements Chef {
    @Override
    public Cook getCook() {
        return new DessertCook();
    }

    @Override
    public Waiter getWaiter() {
        return new DessertWaiter();
    }

    @Override
    public Vizitor getVizitor() {
        return new DessertVizitor();
    }
}
