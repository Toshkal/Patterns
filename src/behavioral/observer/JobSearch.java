package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevelopeJobSite jobSite = new JavaDevelopeJobSite();

        jobSite.addVacacy("First Java Position");
        jobSite.addVacacy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Anton Sokolov");
        Observer secondSubscriber = new Subscriber("Alexsey Loy");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacacy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
