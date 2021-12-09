package designpattern.strategy.tradition;

/**
 * @Package: designpattern.strategy.tradition
 * @ClassName: ToyDuck
 * @Author: guoyy
 * @Description: 玩具鸭重写了父类Duck的所有方法
 * @Date: 2021/12/9 下午10:26
 * @Version: 1.0
 */
public class ToyDuck extends Duck {

    public ToyDuck(String name) {
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

    @Override
    public void quack() {
        System.out.println(super.name + "不会叫");
    }

    @Override
    public void swim() {
        System.out.println(super.name + "不会游泳");
    }
}
