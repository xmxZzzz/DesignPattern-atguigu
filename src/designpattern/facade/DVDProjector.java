package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: DVDProjector
 * @Author: guoyy
 * @Description: 子系统DVDProjector
 * @Date: 2021/11/23 下午11:48
 * @Version: 1.0
 */
public class DVDProjector {

    private static DVDProjector instance = new DVDProjector();

    private DVDProjector() {
    }

    public static DVDProjector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" DVDProjector on ");
    }

    public void off() {
        System.out.println(" DVDProjector off ");
    }

    public void play() {
        System.out.println(" DVDProjector play ");
    }

    public void pause() {
        System.out.println(" DVDProjector pause ");
    }
}
