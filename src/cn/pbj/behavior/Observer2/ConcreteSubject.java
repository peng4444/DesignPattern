package cn.pbj.behavior.Observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable {

    private int state;

    public void set(int s){
        state = s;//目标对象的状态已经发生了改变

        setChanged();//表示目标对象已经发生了改变
        notifyObservers(state);//通知所有的观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
