package designpattern.adapter.objectadapter;

/**
 * @ProjectName: code
 * @Package: designpattern.adapter.classadapter
 * @ClassName: Phone
 * @Author: guoyy
 * @Description: 手机
 * @Date: 2021/9/11 下午11:25
 * @UpdateDate: 2021/9/11 下午11:25
 * @Version: 1.0
 */
public class Phone {
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.out5V() == 5) {
            System.out.println("电压为5V，可以充电");
        } else {
            System.out.println("电压不为5V，不可以充电");
        }
    }
}
