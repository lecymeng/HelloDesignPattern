package design.pattern.structure.proxy;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 真实主题类，也称被代理类
 */
public class RealSubject extends Subject {

  @Override
  public void visit() {
    System.out.println("Real subject");
  }
}
