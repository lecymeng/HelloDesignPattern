package design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weicools on 2018/3/16.
 * <p>
 * desc:
 */
public class Teleplay extends Subject {
    private List<Observer> mObserverList = new ArrayList<>();//储存订阅者

    @Override
    public void pushMsg(String message) {
        for (Observer observer : mObserverList) {
            observer.update(message);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        mObserverList.add(observer);
    }
}
