package designpattern.observer.improve;

/**
 * @Package: designpattern.observer.improve
 * @ClassName: CurrentCondition
 * @Author: guoyy
 * @Description: CurrentCondition观察者
 * @Date: 2021/11/30 上午12:06
 * @Version: 1.0
 */
public class CurrentCondition implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("========CurrentCondition网站的最新数据========");
        System.out.println("最新温度为：" + temperature);
        System.out.println("最新压强为：" + pressure);
        System.out.println("最新湿度为：" + humidity);
    }
}
