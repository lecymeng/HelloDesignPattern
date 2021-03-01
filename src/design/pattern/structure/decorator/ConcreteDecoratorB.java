package design.pattern.structure.decorator;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 装饰者具体实现类
 */
public class ConcreteDecoratorB extends Decorator {
  public ConcreteDecoratorB(Component component) {
    super(component);
  }

  @Override
  public void operator() {
    super.operator();
    operatorA();
    operatorB();
  }

  public void operatorA() {

  }

  public void operatorB() {

  }
}
