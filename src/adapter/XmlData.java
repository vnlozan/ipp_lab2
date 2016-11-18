package adapter;

/**
 * Created by Vladok on 17.11.2016.
 */
public class XmlData implements IXmlData {
    private String data;

    public XmlData(String data) {
        this.data = "XmlData";
    }
    @Override
    public String getData() {
        return data;
    }
}
