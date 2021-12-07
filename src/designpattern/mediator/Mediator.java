package designpattern.mediator;

public abstract class Mediator {
    //注册同事类
    public abstract void registry(String name, Colleague colleague);

    //获取同事类发送来的信息
    public abstract void getMessage(int stateChange, String name);

}
