package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: LightReciver
 * @Author: guoyy
 * @Description: 电灯，命令具体执行者
 * @Date: 2021/11/25 下午11:24
 * @Version: 1.0
 */
public class LightReceiver {

    public void on() {
        System.out.println("开灯。。。。");
    }

    public void off() {
        System.out.println("关灯。。。");
    }
}
