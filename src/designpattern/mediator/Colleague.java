package designpattern.mediator;

/**
 * @Package: designpattern.mediator
 * @ClassName: Colleague
 * @Author: guoyy
 * @Description: 同事类
 * @Date: 2021/12/7 下午10:50
 * @Version: 1.0
 */
public abstract class Colleague {
    //关联中介者
    private Mediator mediator;
    //类名
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    //给中介者发送消息
    public abstract void sendMessage(int stateChange);

    //获取中介者
    public Mediator getMediator() {
        return this.mediator;
    }

    public String getName() {
        return name;
    }
}
