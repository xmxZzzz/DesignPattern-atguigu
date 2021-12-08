package designpattern.state;

/**
 * @Package: designpattern.state
 * @ClassName: DispenseState
 * @Author: guoyy
 * @Description: 可领取奖品状态
 * @Date: 2021/12/9 上午12:20
 * @Version: 1.0
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceIntegration() {
        System.out.println("本状态不需要扣除积分");
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜，请领取您的奖品");
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很抱歉，已无奖品");
//            activity.setState(activity.getDispenseOutState());
            System.exit(0);
        }
    }
}
