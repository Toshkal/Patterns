package abstractFactory.fishDish;

import abstractFactory.Chef;
import abstractFactory.Cook;
import abstractFactory.Vizitor;
import abstractFactory.Waiter;

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
