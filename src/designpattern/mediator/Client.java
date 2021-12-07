package designpattern.mediator;

/**
 * @Package: designpattern.mediator
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试中介者
 * @Date: 2021/12/7 下午11:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator concreteMediator = new ConcreteMediator();
        Alarm alarm = new Alarm(concreteMediator, "alarm");
        TV tv = new TV(concreteMediator, "tv");
        CoffeeMachine coffeeMachine = new CoffeeMachine(concreteMediator, "coffeeMachine");
        Curtains curtains = new Curtains(concreteMediator, "curtains");

        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
