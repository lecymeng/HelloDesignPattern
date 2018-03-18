package design.pattern.structure.composite.safe;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 抽象根节点，为组合中的对象声明接口。在适当的情况下，实现所有类共有接口的缺省行为
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 需要子类实现
     */
    public abstract void doSomething();
}
