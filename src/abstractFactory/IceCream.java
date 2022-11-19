package abstractFactory;

import abstractFactory.dessert.DessertTeamFactory;
import abstractFactory.fishDish.FishTeamFactory;

public class IceCream {
    public static void main(String[] args) {
        DessertTeamFactory DessertTeamFactory = new DessertTeamFactory();
        Cook cook = new DessertTeamFactory().getCook();
        Vizitor vizitor = new DessertTeamFactory().getVizitor();
        Waiter waiter = new DessertTeamFactory().getWaiter();
        System.out.println("Order IceCream");
        cook.cookingOrder();
        vizitor.makeOrder();
        waiter.acceptedOrder();

    }
}
