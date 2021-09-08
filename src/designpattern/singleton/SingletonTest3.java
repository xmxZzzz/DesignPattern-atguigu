package designpattern.singleton;

/**
 * @ProjectName: code
 * @Package: designpattern.singleton.type1
 * @ClassName: Singleton1
 * @Author: guoyy
 * @Description: 单例模式之懒汉式(线程不安全)
 * @Date: 2021/8/29 下午2:57
 * @UpdateDate: 2021/8/29 下午2:57
 * @Version: 1.0
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        //存在线程不安全的问题
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
