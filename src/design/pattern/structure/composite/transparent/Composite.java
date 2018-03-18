package design.pattern.structure.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 具体分支节点，定义有子节点行为
 */
public class Composite extends Component {
    /**
     * 存储节点容器
     */
    private List<Component> mComponentList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (mComponentList != null) {
            for (Component component : mComponentList) {
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component component) {
        mComponentList.add(component);
    }

    @Override
    public void removeChild(Component component) {
        mComponentList.remove(component);
    }

    @Override
    public Component getChildren(int index) {
        return mComponentList.get(index);
    }
}
