package decorator;

/**
 * Created by Vladok on 17.11.2016.
 */
public class AndroidApp extends AppDecorator {
    public AndroidApp(App app) {
        super(app.getName()+", Android app implemented", app);
    }

    @Override
    public int getCost() {
        return app.getCost()+9000;
    }
}
