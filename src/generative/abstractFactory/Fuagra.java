package generative.abstractFactory;
import generative.abstractFactory.fishDish.FishTeamFactory;
//Абстрактная фабрика — это порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов,
// не привязываясь к конкретным классам создаваемых объектов.
public class Fuagra {
    public static void main(String[] args) {
        FishTeamFactory fishTeamFactory = new FishTeamFactory();
        Cook cook = new FishTeamFactory().getCook();
        Vizitor vizitor = new FishTeamFactory().getVizitor();
        Waiter waiter = new FishTeamFactory().getWaiter();
        System.out.println("Order Fish");
        cook.cookingOrder();
        vizitor.makeOrder();
        waiter.acceptedOrder();

    }
}
