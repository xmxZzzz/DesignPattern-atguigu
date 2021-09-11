package designpattern.adapter.classadapter;

/**
 * @ProjectName: code
 * @Package: designpattern.adapter.classadapter
 * @ClassName: VoltageAdapter
 * @Author: guoyy
 * @Description: 电压适配器
 * @Date: 2021/9/11 下午11:22
 * @UpdateDate: 2021/9/11 下午11:22
 * @Version: 1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int out5V() {
        int srcV = out220V();
        int distV = srcV / 44;
        return distV;
    }
}
