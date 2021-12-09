package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: PekingDuck
 * @Author: guoyy
 * @Description: 北京鸭：在构造方法里初始化各种行为
 * @Date: 2021/12/9 下午10:39
 * @Version: 1.0
 */
public class PekingDuck extends Duck {


    public PekingDuck(String type) {
        super(type);
        super.flyBehavior = new NoFlyBehavior();
        super.quackBehavior = new GagaQuackBehavior();
        super.swimBehavior = new GoodSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("======这是一只" + super.type + "======");
    }
}
