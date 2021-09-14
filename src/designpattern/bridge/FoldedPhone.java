package designpattern.bridge;

/**
 * @ProjectName: code
 * @Package: designpattern.bridge
 * @ClassName: FoldedPhone
 * @Author: guoyy
 * @Description: 折叠手机
 * @Date: 2021/9/14 下午10:26
 * @UpdateDate: 2021/9/14 下午10:26
 * @Version: 1.0
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠手机开机");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机关机");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}
