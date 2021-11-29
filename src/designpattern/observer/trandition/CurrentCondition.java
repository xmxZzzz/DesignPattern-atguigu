package designpattern.observer.trandition;

/**
 * @Package: designpattern.observer.trandition
 * @ClassName: CurrentCondition
 * @Author: guoyy
 * @Description: 使用Weather的对象
 * @Date: 2021/11/29 下午11:53
 * @Version: 1.0
 */
public class CurrentCondition {

    private float temperature;
    private float pressure;
    private float humidity;

    /*
     * @Method update
     * @Version  1.0
     * @Description 根据天气预报的数据变化，更新本网站的数据，并打印
     * @param temperature 更新后的温度
     * @param pressure 更新后的压强
     * @param humidity 更新后的湿度
     * @Return void
     * @Exception
     * @Date 2021/11/29 下午11:53
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("最新温度为：" + temperature);
        System.out.println("最新压强为：" + pressure);
        System.out.println("最新湿度为：" + humidity);
    }
}
