package designpattern.state;

/**
 * @Package: designpattern.state
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试状态模式之APP抽奖
 * @Date: 2021/12/9 上午12:37
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 10; i++) {
            System.out.println("==========第" + (i + 1) + "次抽奖==========");
            activity.deduceIntegration();
            activity.raffle();
        }
    }
}
