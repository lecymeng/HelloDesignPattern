package design.pattern.creator.singleton;

/**
 * 5.0
 * 单例模式,使用静态内部类,线程安全[推荐]
 **/
public class IoDHSingleton {
  private static class IoDHSingletonHolder {
    private static final IoDHSingleton INSTANCE = new IoDHSingleton();
  }

  private IoDHSingleton() {
  }

  public static IoDHSingleton getInstance() {
    return IoDHSingletonHolder.INSTANCE;
  }
}
