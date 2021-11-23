package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: TheaterLights
 * @Author: guoyy
 * @Description: 子系统TheaterLights
 * @Date: 2021/11/23 下午11:48
 * @Version: 1.0
 */
public class TheaterLights {

    private static TheaterLights instance = new TheaterLights();

    private TheaterLights() {
    }

    public static TheaterLights getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLights on ");
    }

    public void off() {
        System.out.println(" TheaterLights off ");
    }

    public void dim() {
        System.out.println(" TheaterLights dim ");
    }

    public void light() {
        System.out.println(" TheaterLights light ");
    }
}
