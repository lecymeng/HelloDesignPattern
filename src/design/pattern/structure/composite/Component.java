package design.pattern.structure.composite;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 抽象根节点
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
