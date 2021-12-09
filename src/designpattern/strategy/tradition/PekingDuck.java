package designpattern.strategy.tradition;

/**
 * @Package: designpattern.strategy.tradition
 * @ClassName: PekingDuck
 * @Author: guoyy
 * @Description: 北京鸭子不会飞，重写了父类Duck的fly方法
 * @Date: 2021/12/9 下午10:24
 * @Version: 1.0
 */
public class PekingDuck extends Duck {

    public PekingDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是 " + super.name);
    }

    @Override
    public void fly() {
        System.out.println(super.name + "不会飞");
    }
}
