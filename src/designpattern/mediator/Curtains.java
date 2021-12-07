package designpattern.mediator;


/**
 * @Package: designpattern.mediator
 * @ClassName: Curtains
 * @Author: guoyy
 * @Description: 具体Colleague对象
 * @Date: 2021/12/7 下午11:04
 * @Version: 1.0
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registry(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void upCurtains() {
        System.out.println("I am holding Up Curtains!");
    }

}
