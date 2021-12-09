package designpattern.strategy.improve;

/**
 * @Package: designpattern.strategy.improve
 * @ClassName: GoodFlyBehavior
 * @Author: guoyy
 * @Description: 表示飞得好行为
 * @Date: 2021/12/9 下午10:31
 * @Version: 1.0
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞得好");
    }
}
