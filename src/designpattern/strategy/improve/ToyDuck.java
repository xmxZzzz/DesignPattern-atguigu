package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: ToyDuck
 * @Author: guoyy
 * @Description: 玩具鸭：在构造方法里初始化各种行为
 * @Date: 2021/12/9 下午10:38
 * @Version: 1.0
 */
public class ToyDuck extends Duck {

    public ToyDuck(String type) {
        super(type);
        super.flyBehavior = new NoFlyBehavior();
        super.quackBehavior = new NoQuackBehavior();
        super.swimBehavior = new NoSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("======这是一只" + super.type + "======");
    }
}
