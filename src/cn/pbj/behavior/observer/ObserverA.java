package cn.pbj.behavior.observer;

public class ObserverA implements Observer {

    private  int myState;//myState需要跟所有的state中保持一致
    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
