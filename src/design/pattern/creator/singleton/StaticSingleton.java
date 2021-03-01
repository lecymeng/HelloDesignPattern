package design.pattern.creator.singleton;

/**
 * 4.0
 * 单例模式,饿汉式,变种-线程不安全
 **/
public class StaticSingleton {
  private static StaticSingleton sInstance = null;

  static {
    sInstance = new StaticSingleton();
  }

  private StaticSingleton() {}

  public static StaticSingleton getInstance() {
    return sInstance;
  }
}
