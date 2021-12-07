package designpattern.mediator;

/**
 * @Package: designpattern.mediator
 * @ClassName: Alarm
 * @Author: guoyy
 * @Description: 具体Colleague对象
 * @Date: 2021/12/7 下午11:00
 * @Version: 1.0
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在相应中介者中注册自己
        mediator.registry(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
}
