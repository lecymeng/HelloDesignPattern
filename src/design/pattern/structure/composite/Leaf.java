package design.pattern.structure.composite;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 具体叶子节点
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
