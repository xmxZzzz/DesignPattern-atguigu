package designpattern.observer.trandition;

public class Client {
    public static void main(String[] args) {
        CurrentCondition currentCondition = new CurrentCondition();
        WeatherData weatherData = new WeatherData(currentCondition);

        weatherData.setData(10f, 20f, 30f);
    }
}
