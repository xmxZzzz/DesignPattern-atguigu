package designpattern.observer.improve;

/**
 * @Package: designpattern.observer.improve
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试观察者模式
 * @Date: 2021/11/30 上午12:06
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Observer currentCondition = new CurrentCondition();
        Observer baiduSite = new BaiduSite();
        WeatherData weatherData = new WeatherData();

        // 注册观察者CurrentCondition
        weatherData.registryObserver(currentCondition);
        //注册观察者BaiduSite
        weatherData.registryObserver(baiduSite);

        //天气数据更新
        weatherData.setData(10f, 20f, 30f);

        System.out.println("==============更新观察者和数据后==============");
        //移除观察者currentCondition
        weatherData.removeObserver(currentCondition);

        //天气数据更新
        weatherData.setData(20f, 10f, 40f);


    }
}
