package decorator;

/**
 * Created by Vladok on 17.11.2016.
 */
public abstract class AppDecorator extends App {
    protected App app;
    public AppDecorator(String name,App app) {
        super(name);
        this.app=app;
    }
}
