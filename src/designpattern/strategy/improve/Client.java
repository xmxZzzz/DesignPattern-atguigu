package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试策略模式之鸭子问题
 * @Date: 2021/12/9 下午10:40
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck("野生鸭");
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();
        wildDuck.swim();

        PekingDuck pekingDuck = new PekingDuck("北京鸭");
        pekingDuck.display();
        pekingDuck.fly();
        pekingDuck.quack();
        pekingDuck.swim();

        ToyDuck toyDuck = new ToyDuck("玩具鸭");
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.swim();

        System.out.println("==========更新玩具鸭：会嘎嘎叫和游泳很好===========");
        toyDuck.setQuackBehavior(new GagaQuackBehavior());
        toyDuck.setSwimBehavior(new GoodSwimBehavior());
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.swim();
    }
}
