package design.pattern.structure.decorator;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 客户调用
 */
public class Client {
  public static void main(String[] args) {
    //被装饰的组件对象
    Component component = new ConcreteComponent();

    //根据组件对象构造装饰者A并调用，相当于给组件对象增加装饰着A的功能
    Decorator decoratorA = new ConcreteDecoratorA(component);
    decoratorA.operator();

    //根据组件对象构造装饰者B并调用，相当于给组件对象增加装饰着B的功能
    Decorator decoratorB = new ConcreteDecoratorA(component);
    decoratorB.operator();
  }
}
