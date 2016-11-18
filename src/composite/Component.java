package composite;

/**
 * Created by Vladok on 17.11.2016.
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void Add(Component component){}

    public void Remove(Component component) { }

    public void Print()
    {
        System.out.println(name);
    }
}
