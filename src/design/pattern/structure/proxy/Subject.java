package design.pattern.structure.proxy;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 抽象主题类，主要职责是申明真实与代理主题的共同接口方法
 * 可以是抽象类也可以是接口
 */
public abstract class Subject {
    public abstract void visit();
}
