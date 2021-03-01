package design.pattern.structure.decorator;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 装饰者具体实现类
 */
public class ConcreteDecoratorA extends Decorator {
  public ConcreteDecoratorA(Component component) {
    super(component);
  }

  @Override
  public void operator() {
    operatorA();
    super.operator();
    operatorB();
  }

  public void operatorA() {

  }

  public void operatorB() {

  }
}
