package designpattern.observer.trandition;

/**
 * @Package: designpattern.observer.trandition
 * @ClassName: WeatherData
 * @Author: guoyy
 * @Description: 天气预报更新对象
 * @Date: 2021/11/29 下午11:52
 * @Version: 1.0
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;

    //维护一个当前网站对象currentCondition
    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    /*
     * @Method setData
     * @Description 更新数据，同时调用update通知当前网站currentCondition
     * @param temperature  更新的温度
     * @param pressure 更新的压强
     * @param humidity 更新的湿度
     * @Return void
     * @Date 2021/11/29 下午11:50
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        update();
    }

    /*
     * @Method update
     * @Version  1.0
     * @Description 通知currentCondition更新数据
     * @Date 2021/11/29 下午11:52
     */
    public void update() {
        currentCondition.update(temperature, pressure, humidity);
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
