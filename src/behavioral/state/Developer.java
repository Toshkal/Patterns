package behavioral.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleep){
            setActivity(new Training());
        } else if (activity instanceof Training){
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        }else if (activity instanceof Reading){
            setActivity(new Sleep());
        }
    }
    public void justDoIt(){
        activity.justDoIt();
    }
}
