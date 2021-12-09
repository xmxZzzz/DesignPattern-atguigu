package designpattern.strategy.improve;

public class NoSwimBehavior implements SwimBehavior {
    @Override
    public void swin() {
        System.out.println("不会游泳");
    }
}
