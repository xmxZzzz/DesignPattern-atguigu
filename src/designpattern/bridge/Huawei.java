package designpattern.bridge;

/**
 * @ProjectName: code
 * @Package: designpattern.bridge
 * @ClassName: Huawei
 * @Author: guoyy
 * @Description: 华为品牌手机
 * @Date: 2021/9/14 下午10:23
 * @UpdateDate: 2021/9/14 下午10:23
 * @Version: 1.0
 */
public class Huawei implements Brand {
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
