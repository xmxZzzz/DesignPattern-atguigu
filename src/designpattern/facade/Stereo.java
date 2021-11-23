package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: Stereo
 * @Author: guoyy
 * @Description: 子系统Stereo
 * @Date: 2021/11/23 下午11:48
 * @Version: 1.0
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Stereo off ");
    }

    public void setVol() {
        System.out.println(" Stereo setVol ");
    }
}
