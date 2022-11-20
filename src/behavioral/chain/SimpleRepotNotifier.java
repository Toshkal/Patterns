package behavioral.chain;

public class SimpleRepotNotifier extends Notifier{
    public SimpleRepotNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifiying using simple report: " + message);
    }
}
