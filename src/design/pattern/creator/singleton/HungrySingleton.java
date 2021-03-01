package design.pattern.creator.singleton;

/**
 * 2.0
 * 单例模式,饿汉式,线程不安全
 */
public class HungrySingleton {
  private static HungrySingleton sInstance = null;

  private HungrySingleton() {}

  public static HungrySingleton getInstance() {
    if (sInstance == null) {
      sInstance = new HungrySingleton();
    }
    return sInstance;
  }
}
