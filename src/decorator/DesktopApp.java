package decorator;

/**
 * Created by Vladok on 17.11.2016.
 */
public class DesktopApp extends App {

    public DesktopApp() {
        super("Desktop App");
    }

    @Override
    public int getCost() {
        return 1000;
    }
}
