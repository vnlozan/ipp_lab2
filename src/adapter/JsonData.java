package adapter;

/**
 * Created by Vladok on 17.11.2016.
 */
public class JsonData implements IJsonData {
    private String data;
    public JsonData() {
        this.data = "JsonData";
    }
    @Override
    public String getData() {
        return data;
    }
    @Override
    public void transformToXml() {
        data+=" transformed into XmlData";
    }
}
