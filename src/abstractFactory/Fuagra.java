package abstractFactory;
import abstractFactory.fishDish.FishTeamFactory;

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
