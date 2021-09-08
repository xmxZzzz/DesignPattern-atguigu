package designpattern.singleton;

import java.awt.event.WindowStateListener;

/**
 * @ProjectName: code
 * @Package: designpattern.singleton.type1
 * @ClassName: Singleton1
 * @Author: guoyy
 * @Description: 单例模式之静态内部类
 * @Date: 2021/8/29 下午2:57
 * @UpdateDate: 2021/8/29 下午2:57
 * @Version: 1.0
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton7{

    private Singleton7(){}

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();

    }

    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
