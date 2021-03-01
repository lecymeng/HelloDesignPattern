package design.pattern.behavior.observer;

/**
 * Created by Weicools on 2018/3/16.
 * <p>
 * desc: 抽象观察者类，为所有具体观察者定义一个接口，在得到通知时更新自己
 */
public interface Observer {
  /**
   * 更新消息
   *
   * @param message 消息
   */
  void update(String message);
}
