package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: Screen
 * @Author: guoyy
 * @Description: 子系统Screen
 * @Date: 2021/11/23 下午11:48
 * @Version: 1.0
 */
public class Screen {

    private static Screen instance = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Screen on ");
    }

    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
