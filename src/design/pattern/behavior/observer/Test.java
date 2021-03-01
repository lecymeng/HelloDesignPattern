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
    Animation animation = new Animation();
    animation.addObserver(user1);
    animation.addObserver(user2);
    animation.addObserver(user3);
    animation.pushMsg("境界的彼方");
  }
}
