package designpattern.state;

/**
 * @Package: designpattern.state
 * @ClassName: NoRaffleState
 * @Author: guoyy
 * @Description: 不可抽奖状态
 * @Date: 2021/12/9 上午12:16
 * @Version: 1.0
 */
public class NoRaffleState extends State {

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceIntegration() {
        System.out.println("扣除50积分");
        //扣除积分后，状态更改为可抽奖状态
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        //当前状态不可抽奖
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("暂时无法领取奖品");
    }
}
