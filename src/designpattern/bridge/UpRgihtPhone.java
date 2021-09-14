package designpattern.bridge;

/**
 * @ProjectName: code
 * @Package: designpattern.bridge
 * @ClassName: UpRgihtPhone
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/14 下午10:35
 * @UpdateDate: 2021/9/14 下午10:35
 * @Version: 1.0
 */
public class UpRgihtPhone extends Phone {
    public UpRgihtPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("滑盖手机开机");
    }

    public void close() {
        super.close();
        System.out.println("滑盖手机关机");
    }

    public void call() {
        super.call();
        System.out.println("滑盖手机打电话");
    }
}
