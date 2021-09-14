package designpattern.bridge;

/**
 * @ProjectName: code
 * @Package: designpattern.bridge
 * @ClassName: XiaoMi
 * @Author: guoyy
 * @Description: 小米品牌手机
 * @Date: 2021/9/14 下午10:22
 * @UpdateDate: 2021/9/14 下午10:22
 * @Version: 1.0
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
