package designpattern.singleton;

/**
 * @ProjectName: code
 * @Package: designpattern.singleton.type1
 * @ClassName: Singleton1
 * @Author: guoyy
 * @Description: 单例模式之枚举
 * @Date: 2021/8/29 下午2:57
 * @UpdateDate: 2021/8/29 下午2:57
 * @Version: 1.0
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance1 == instance2);

        instance1.say();
    }
}

enum Singleton8{

    INSTANCE;

    public void say(){
        System.out.println("say hello...");
    }
}
