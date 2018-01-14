package design.pattern.creator.singleton;

/**
 * 7.0
 * 静态内部类,使用双重校验锁,线程安全[推荐]
 **/
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
