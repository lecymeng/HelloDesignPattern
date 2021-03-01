package design.pattern.creator.singleton;

/**
 * 1.0
 * 单例模式,懒汉式,线程安全
 */
public class LazySingleton {
  private final static LazySingleton INSTANCE = new LazySingleton();

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    return INSTANCE;
  }
}
