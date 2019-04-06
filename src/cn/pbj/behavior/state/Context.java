package cn.pbj.behavior.state;

public class Context {
    private State state;

    public void setState(State state1) {
        System.out.println("修改状态");
        state = state1;
        state.handle();
    }
}
