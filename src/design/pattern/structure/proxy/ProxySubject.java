package design.pattern.structure.proxy;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 代理类，持有真实主题的引用，它实现的接口方法中调用真实主题的方法
 */
public class ProxySubject extends Subject {
  private Subject mRealSubject;

  public ProxySubject(Subject subject) {
    mRealSubject = subject;
  }

  @Override
  public void visit() {
    System.out.println("Proxy subject");

    // 调用真实主题方法
    mRealSubject.visit();
  }
}
