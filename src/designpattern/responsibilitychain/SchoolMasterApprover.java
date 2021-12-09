package designpattern.responsibilitychain;

/**
 * @Package: designpattern.responsibilitychain
 * @ClassName: SchoolMasterApprover
 * @Author: guoyy
 * @Description: 审核人——校长，处理大于30000元的购买请求
 * @Date: 2021/12/10 上午12:12
 * @Version: 1.0
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getMoney() > 30000) {
            System.out.println("请求编号为" + purchaseRequest.getId() + "的订单被" + super.getName() + "处理");
        } else {
            //将请求交给下一个审核人进行处理
            super.getApprover().processRequest(purchaseRequest);
        }
    }
}
