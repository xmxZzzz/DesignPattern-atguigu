package designpattern.observer.improve;

/**
 * @Package: designpattern.observer.improve
 * @ClassName: BaiduSite
 * @Author: guoyy
 * @Description: BaiduSite观察者
 * @Date: 2021/11/30 上午12:11
 * @Version: 1.0
 */
public class BaiduSite implements Observer {
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
        System.out.println("========BaiduSite网站的最新数据========");
        System.out.println("最新温度为：" + temperature);
        System.out.println("最新压强为：" + pressure);
        System.out.println("最新湿度为：" + humidity);
    }
}
