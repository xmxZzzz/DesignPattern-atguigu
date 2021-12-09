package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: WildDuck
 * @Author: guoyy
 * @Description: 野生鸭：在构造方法里初始化各种行为
 * @Date: 2021/12/9 下午10:39
 * @Version: 1.0
 */
public class WildDuck extends Duck {

    public WildDuck(String type) {
        super(type);
        super.flyBehavior = new GoodFlyBehavior();
        super.quackBehavior = new GeGeQuackBehavior();
        super.swimBehavior = new GoodSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("======这是一只" + super.type + "======");
    }
}
