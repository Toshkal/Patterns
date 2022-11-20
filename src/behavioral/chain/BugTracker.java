package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleRepotNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSnotifier(Priority.ASAP);

        reportNotifier.setNextNotifire(emailNotifier);
        emailNotifier.setNextNotifire(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problem here", Priority.ASAP);
    }
}
