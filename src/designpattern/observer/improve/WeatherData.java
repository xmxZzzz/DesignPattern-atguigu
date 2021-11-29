package designpattern.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    //维护一个观察者集合
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    /*
     * @Method registryObserver
     * @Version  1.0
     * @Description 注册一个观察者
     * @param o 待注册的观察者
     * @Return void
     * @Date 2021/11/30 上午12:02
     */
    @Override
    public void registryObserver(Observer o) {
        observerList.add(o);
    }

    /*
     * @Method removeObserver
     * @Version  1.0
     * @Description 移除一个观察者
     * @param o 待移除的观察者
     * @Return void
     * @Date 2021/11/30 上午12:02
     */
    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    /*
     * @Method notifyAllObserver
     * @Version  1.0
     * @Description 通知已注册的所有观察者
     * @Return void
     * @Date 2021/11/30 上午12:02
     */
    @Override
    public void notifyAllObserver() {
        for (Observer o : observerList) {
            //对于每一个观察者，分别更新最新的数据
            o.update(temperature, pressure, humidity);
        }
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        update();
    }

    public void update() {
        notifyAllObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
