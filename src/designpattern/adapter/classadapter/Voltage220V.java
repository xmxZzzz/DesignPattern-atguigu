package designpattern.adapter.classadapter;

/**
 * @ProjectName: code
 * @Package: designpattern.adapter.classadapter
 * @ClassName: Voltage220V
 * @Author: guoyy
 * @Description: 被适配类——220V电压
 * @Date: 2021/9/11 下午11:20
 * @UpdateDate: 2021/9/11 下午11:20
 * @Version: 1.0
 */
public class Voltage220V {
    public int out220V() {
        int src = 220;
        System.out.println("电压" + src + "伏");
        return 220;
    }
}
