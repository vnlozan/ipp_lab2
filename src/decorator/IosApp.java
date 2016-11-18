package decorator;

/**
 * Created by Vladok on 17.11.2016.
 */
public class IosApp extends AppDecorator {
    public IosApp(App app) {
        super(app.getName()+", Ios app implemented", app);
    }

    @Override
    public int getCost() {
        return app.getCost()+6000;
    }
}