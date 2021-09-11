package designpattern.adapter.objectadapter;

/**
 * @ProjectName: code
 * @Package: designpattern.adapter.classadapter
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试
 * @Date: 2021/9/11 下午11:27
 * @UpdateDate: 2021/9/11 下午11:27
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器----------");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
