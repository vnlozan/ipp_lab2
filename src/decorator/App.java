package decorator;

/**
 * Created by Vladok on 17.11.2016.
 */
public abstract class App {
    private String Name;

    public App(String name) {
        Name = name;
    }
    public abstract int getCost();
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
