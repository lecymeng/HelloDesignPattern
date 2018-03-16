package design.pattern.behavior.observer;

/**
 * Created by Weicools on 2018/3/16.
 * <p>
 * desc:
 */
public abstract class Subject {
    /**
     * 推送消息
     * @param message 内容
     */
    public abstract void pushMsg(String message);

    /**
     * 订阅
     * @param observer 订阅者
     */
    public abstract void addObserver(Observer observer);
}
