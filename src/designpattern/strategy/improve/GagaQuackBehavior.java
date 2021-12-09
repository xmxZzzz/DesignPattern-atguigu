package designpattern.strategy.improve;

public class GagaQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
