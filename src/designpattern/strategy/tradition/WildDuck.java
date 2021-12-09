package designpattern.strategy.tradition;

/**
 * @Package: designpattern.strategy.tradition
 * @ClassName: WildDuck
 * @Author: guoyy
 * @Description: 野生鸭子会飞、会叫、会游泳
 * @Date: 2021/12/9 下午10:21
 * @Version: 1.0
 */
public class WildDuck extends Duck {

    public WildDuck(String name) {
        super(name);
    }

    /*
     * @Method display
     * @Version  1.0
     * @Description 实现父类抽象方法
     * @Date 2021/12/9 下午10:22
     */
    @Override
    public void display() {
        System.out.println("这是 " + super.name);
    }
}
