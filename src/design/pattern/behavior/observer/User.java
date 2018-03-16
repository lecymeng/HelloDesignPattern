package design.pattern.behavior.observer;

/**
 * Created by Weicools on 2018/3/16.
 * <p>
 * desc:
 */
public class User implements Observer {
    private String mName;

    public User(String name) {
        mName = name;
    }

    @Override
    public void update(String message) {
        System.out.println(mName + ": 订阅的" + message + "更新了");
    }
}
