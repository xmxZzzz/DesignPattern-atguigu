package designpattern.responsibilitychain;

/**
 * @Package: designpattern.responsibilitychain
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试职责链模式之OA购买审核
 * @Date: 2021/12/10 上午12:12
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 20000);

        DepartmentApprover departmentApprover = new DepartmentApprover("系主任");
        ColleageApprover colleageApprover = new ColleageApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        //设置每个审核人的下一个审核者
        departmentApprover.setApprover(colleageApprover);
        colleageApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);

        //默认必须从系主任departmentApprover开始审核
        departmentApprover.processRequest(purchaseRequest);
    }
}
