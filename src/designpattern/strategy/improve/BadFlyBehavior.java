package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: BadFlyBehavior
 * @Author: guoyy
 * @Description: 表示飞得一般行为
 * @Date: 2021/12/9 下午10:32
 * @Version: 1.0
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞得一般");
    }
}
