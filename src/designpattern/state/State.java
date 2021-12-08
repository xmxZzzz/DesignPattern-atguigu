package designpattern.state;

/**
 * @Package: designpattern.state
 * @ClassName: State
 * @Author: guoyy
 * @Description: 抽象类，定义所有行为
 * @Date: 2021/12/9 上午12:13
 * @Version: 1.0
 */
public abstract class State {

    //当处于不可抽奖状态时，支持减少积分
    public abstract void deduceIntegration();

    //是否抽奖
    public abstract boolean raffle();

    //是否分发奖品
    public abstract void dispensePrize();

}
