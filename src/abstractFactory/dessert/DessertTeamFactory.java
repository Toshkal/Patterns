package abstractFactory.dessert;

import abstractFactory.Chef;
import abstractFactory.Cook;
import abstractFactory.Vizitor;
import abstractFactory.Waiter;

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
