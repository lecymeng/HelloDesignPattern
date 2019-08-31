package headfirst;

public class ModelDuck extends Duck {
  public ModelDuck () {
    mFlyBehavior = new FlyNoWay();
    mQuackBehavior = new Quack();
  }

  @Override
  public void display () {
    System.out.println("I'm a model duck");
  }
}
