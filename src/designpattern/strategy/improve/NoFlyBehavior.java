package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: NoFlyBehavior
 * @Author: guoyy
 * @Description: 表示不会飞
 * @Date: 2021/12/9 下午10:32
 * @Version: 1.0
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
