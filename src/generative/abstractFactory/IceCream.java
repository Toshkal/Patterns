package generative.abstractFactory;

import generative.abstractFactory.dessert.DessertTeamFactory;

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
