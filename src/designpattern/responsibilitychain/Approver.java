package designpattern.responsibilitychain;

public abstract class Approver {

    //维护审核人的姓名
    private String name;
    //维护下一个审核人
    private Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    /*
     * @Method processRequest
     * @Version  1.0
     * @Description 处理购买请求的具体实现方法由具体子类实现
     * @param purchaseRequest 购买请求
     * @Return void
     * @Date 2021/12/10 上午12:04
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }

    public Approver getApprover() {
        return approver;
    }
}
