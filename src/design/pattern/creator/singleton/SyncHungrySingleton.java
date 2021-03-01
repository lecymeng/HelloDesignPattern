package design.pattern.creator.singleton;

/**
 * 3.0
 * 单例模式,饿汉式,线程不安全,多线程环境下效率不高-synchronized
 **/
public class SyncHungrySingleton {
  private static SyncHungrySingleton sInstance = null;

  private SyncHungrySingleton() {}

  public static synchronized SyncHungrySingleton getInstance() {
    if (sInstance == null) {
      sInstance = new SyncHungrySingleton();
    }
    return sInstance;
  }
}
