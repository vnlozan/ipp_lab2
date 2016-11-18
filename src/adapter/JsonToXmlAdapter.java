package adapter;

/**
 * Created by Vladok on 17.11.2016.
 */
public class JsonToXmlAdapter implements IXmlData {
    private JsonData data;

    public JsonToXmlAdapter(JsonData data) {
        this.data = data;
    }

    @Override
    public String getData() {
        data.transformToXml();
        return data.getData();
    }
}
