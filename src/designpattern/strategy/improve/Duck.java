package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: Duck
 * @Author: guoyy
 * @Description: 抽象类，聚合了各种行为接口
 * @Date: 2021/12/9 下午10:35
 * @Version: 1.0
 */
public abstract class Duck {

    //鸭子的名字
    protected String type;

    //维护一个飞行的行为
    protected FlyBehavior flyBehavior;
    //维护一个叫声行为
    protected QuackBehavior quackBehavior;
    //维护一个游泳行为
    protected SwimBehavior swimBehavior;

    public Duck(String type) {
        this.type = type;
    }

    //抽象方法，用于展示鸭子的信息
    public abstract void display();

    //抽象的方法，由Duck的具体子类决定
    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    //鸭子是否会叫
    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    //鸭子是否会游泳
    public void swim() {
        if (swimBehavior != null) {
            swimBehavior.swin();
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}
