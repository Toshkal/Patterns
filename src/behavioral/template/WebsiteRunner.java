package behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcome = new Welcome();
        WebsiteTemplate news = new News();

        welcome.showPage();

        System.out.println("\n=============================\n");

        news.showPage();
    }
}
