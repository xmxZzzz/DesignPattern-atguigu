package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: Projector
 * @Author: guoyy
 * @Description: 子系统Projector
 * @Date: 2021/11/23 下午11:48
 * @Version: 1.0
 */
public class Projector {

    private static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector off ");
    }

    public void focus() {
        System.out.println(" Projector focus ");
    }

    public void zoom() {
        System.out.println(" Projector zoom ");
    }
}
