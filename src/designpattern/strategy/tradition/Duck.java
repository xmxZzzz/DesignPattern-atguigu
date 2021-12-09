package designpattern.strategy.tradition;

/**
 * @Package: designpattern.strategy.tradition
 * @ClassName: Duck
 * @Author: guoyy
 * @Description: 表示鸭子的抽象类，包含公共的方法fly、quack、swim
 * @Date: 2021/12/9 下午10:22
 * @Version: 1.0
 */
public abstract class Duck {

    protected String name;

    public Duck(String name) {
        this.name = name;
    }

    //输出鸭子的信息
    public abstract void display();

    public void fly() {
        System.out.println("鸭子会飞");
    }

    public void quack() {
        System.out.println("鸭子会叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }
}
