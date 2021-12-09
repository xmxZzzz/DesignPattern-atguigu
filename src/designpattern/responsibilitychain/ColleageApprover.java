package designpattern.responsibilitychain;

/**
 * @Package: designpattern.responsibilitychain
 * @ClassName: ColleageApprover
 * @Author: guoyy
 * @Description: 审核人——院长，处理5000元-10000元的购买请求
 * @Date: 2021/12/10 上午12:08
 * @Version: 1.0
 */
public class ColleageApprover extends Approver {

    public ColleageApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getMoney() > 5000 && purchaseRequest.getMoney() <= 10000) {
            System.out.println("请求编号为" + purchaseRequest.getId() + "的订单被" + super.getName() + "处理");
        } else {
            //将请求交给下一个审核人进行处理
            super.getApprover().processRequest(purchaseRequest);
        }
    }
}
