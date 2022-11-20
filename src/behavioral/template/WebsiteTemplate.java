package behavioral.template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContact();
        System.out.println("Header");
    }
    public abstract void showPageContact();
}
