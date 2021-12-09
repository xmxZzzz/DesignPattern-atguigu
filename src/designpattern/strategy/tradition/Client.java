package designpattern.strategy.tradition;

/**
 * @Package: designpattern.strategy.tradition
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试鸭子问题的传统解决方法
 * 问题：不具有共性，重写了父类的方法
 * @Date: 2021/12/9 下午10:26
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck("野生鸭子");
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();
        wildDuck.swim();

        PekingDuck pekingDuck = new PekingDuck("北京鸭子");
        pekingDuck.display();
        pekingDuck.fly();
        pekingDuck.quack();
        pekingDuck.swim();

        ToyDuck toyDuck = new ToyDuck("玩具鸭子");
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.swim();

    }
}
