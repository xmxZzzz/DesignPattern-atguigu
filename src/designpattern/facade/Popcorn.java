package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: Popcorn
 * @Author: guoyy
 * @Description: 子系统Popcorn
 * @Date: 2021/11/23 下午11:48
 * @Version: 1.0
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Popcorn on ");
    }

    public void off() {
        System.out.println(" Popcorn off ");
    }

    public void pop() {
        System.out.println(" Popcorn pop ");
    }
}
