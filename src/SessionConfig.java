import adapter.IXmlData;

/**
 * Created by Vladok on 17.11.2016.
 */
public class SessionConfig {
    private String currentData;
    private static class Holder {
        private static final SessionConfig _instance = new SessionConfig();
    }
    public void setCurrentData(IXmlData data){
        currentData=data.getData();
    }

    public String getCurrentData() {
        return currentData;
    }

    public static SessionConfig getInstance() {
        return Holder._instance;
    }
}
