package behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifire;

    public Notifier(int priority) {
        this.priority = priority;
    }
    public void setNextNotifire(Notifier notifire){
        this.nextNotifire = nextNotifire;
    }
    public void notifyManager(String message, int level){
        if (level >= priority) {
            write(message);
        }
        if (nextNotifire != null) {
            nextNotifire.notifyManager(message,level);
        }
    }
    public abstract void write(String message);
}
