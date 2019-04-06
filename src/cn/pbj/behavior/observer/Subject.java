package cn.pbj.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    //t通知所有的观察者更新状态
    public void notifyAllObservers(){
        for(Observer observer: list){
            observer.update(this);
        }
    }
}
