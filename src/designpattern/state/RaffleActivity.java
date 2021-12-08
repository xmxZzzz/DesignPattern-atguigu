package designpattern.state;

/**
 * @Package: designpattern.state
 * @ClassName: RaffleActivity
 * @Author: guoyy
 * @Description: 抽奖活动
 * @Date: 2021/12/9 上午12:17
 * @Version: 1.0
 */
public class RaffleActivity {

    //当前抽奖状态
    State state;
    //维护所有的状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);
    //奖品数量
    int count;

    public RaffleActivity(int count) {
        //初始化时的状态是不可抽奖状态
        this.state = noRaffleState;
        this.count = count;
    }

    //减少积分
    public void deduceIntegration() {
        this.state.deduceIntegration();
    }

    //抽奖
    public void raffle() {
        //如果中奖
        if (this.state.raffle()) {
            //则领取奖品
            this.state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public int getCount() {
        //当每次获取当前奖品数量后，数量减一
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
