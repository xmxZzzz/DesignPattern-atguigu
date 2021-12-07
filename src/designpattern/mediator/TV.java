package designpattern.mediator;


/**
 * @Package: designpattern.mediator
 * @ClassName: TV
 * @Author: guoyy
 * @Description: 具体Colleague对象
 * @Date: 2021/12/7 下午11:01
 * @Version: 1.0
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registry(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void startTV() {
        System.out.println("It's time to start TV");
    }

    public void stopTV() {
        System.out.println("It's time to stop TV");
    }
}
