package designpattern.bridge;

/**
 * @ProjectName: code
 * @Package: designpattern.bridge
 * @ClassName: Client
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/14 下午10:30
 * @UpdateDate: 2021/9/14 下午10:30
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new Huawei());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("=============");

        Phone upRgihtPhone = new UpRgihtPhone(new XiaoMi());
        upRgihtPhone.open();
        upRgihtPhone.call();
        upRgihtPhone.close();
    }
}
