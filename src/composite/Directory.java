package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladok on 17.11.2016.
 */
public class Directory extends Component {
    private List<Component> components = new ArrayList<>();
    public Directory(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        components.add(component);
    }

    @Override
    public void Remove(Component component) {
        components.remove(component);
    }

    @Override
    public void Print() {
        System.out.println("Node "+name);
        System.out.println("Subnodes ");
        for(int i=0; i<components.size();i++)
        {
            components.get(i).Print();
        }
    }
}
