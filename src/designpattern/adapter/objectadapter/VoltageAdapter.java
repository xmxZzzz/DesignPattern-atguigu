package designpattern.adapter.objectadapter;

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
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int out5V() {
        int distV = 0;
        if (null != this.voltage220V) {
            int srcV = this.voltage220V.out220V();
            System.out.println("开始适配，原始电压为" + srcV + "伏");
            distV = srcV / 44;
            System.out.println("适配完成，输出电压为" + distV + "伏");
        }
        return distV;
    }
}
