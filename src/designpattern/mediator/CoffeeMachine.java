package designpattern.mediator;


/**
 * @Package: designpattern.mediator
 * @ClassName: CoffeeMachine
 * @Author: guoyy
 * @Description: 具体Colleague对象
 * @Date: 2021/12/7 下午11:05
 * @Version: 1.0
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registry(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void startCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void finishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }

}
