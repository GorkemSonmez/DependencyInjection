package java.gorkemsonmez.app1;

public class Customer {
    private AndroidDeveloper developer;

    public Customer() {
        developer =new AndroidDeveloper();
    }

    public void createApp() {
        developer.shouldDoAnApplication();
    }
}
