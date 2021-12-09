package designpattern.strategy.improve;

public class GeGeQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸽鸽叫");
    }
}
