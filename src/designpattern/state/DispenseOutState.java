package designpattern.state;

/**
 * @Package: designpattern.state
 * @ClassName: DispenseOutState
 * @Author: guoyy
 * @Description: 无可领取奖品状态
 * @Date: 2021/12/9 上午12:21
 * @Version: 1.0
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceIntegration() {
        System.out.println("奖品发完了，请下次参与");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发完了，请下次参与");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发完了，请下次参与");
    }
}
