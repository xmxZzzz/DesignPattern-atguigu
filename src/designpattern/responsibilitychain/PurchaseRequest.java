package designpattern.responsibilitychain;

/**
 * @Package: designpattern.responsibilitychain
 * @ClassName: PurchaseRequest
 * @Author: guoyy
 * @Description: 购买请求的详细信息
 * @Date: 2021/12/10 上午12:00
 * @Version: 1.0
 */
public class PurchaseRequest {

    //请求编号
    private int id = 0;
    //请求的购买金额
    private float money = 0.0f;

    public PurchaseRequest(int id, float money) {
        this.id = id;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
