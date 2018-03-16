package design.pattern.behavior.observer;

/**
 * Created by Weicools on 2018/3/16.
 * <p>
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        // 观察者, 即订阅用户
        User user1 = new User("XXX");
        User user2 = new User("YYY");
        User user3 = new User("ZZZ");

        // 被观察者, 用户订阅的……
        Teleplay teleplay = new Teleplay();
        teleplay.addObserver(user1);
        teleplay.addObserver(user2);
        teleplay.addObserver(user3);
        teleplay.pushMsg("仙剑奇侠传");
    }
}
