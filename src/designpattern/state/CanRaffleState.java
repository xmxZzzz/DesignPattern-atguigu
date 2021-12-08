package designpattern.state;

import java.util.Random;

/**
 * @Package: designpattern.state
 * @ClassName: CanRaffleState
 * @Author: guoyy
 * @Description: 可抽奖状态
 * @Date: 2021/12/9 上午12:20
 * @Version: 1.0
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceIntegration() {
        System.out.println("本状态不需要扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("开始抽奖，请稍候");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0) {
            System.out.println("恭喜您，中奖了");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很抱歉，您未中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("暂时无法领取奖品");
    }
}
