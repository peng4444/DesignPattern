package cn.pbj.behavior.observer;

public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;


        //目标对象（主题对象），请通知所有的观察者
        this.notifyAllObservers();
    }
}
