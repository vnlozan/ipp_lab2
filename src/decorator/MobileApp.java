package decorator;

/**
 * Created by Vladok on 17.11.2016.
 */
public class MobileApp extends App {
    public MobileApp() {
        super("MobileApp");
    }

    @Override
    public int getCost() {
        return 2000;
    }
}
