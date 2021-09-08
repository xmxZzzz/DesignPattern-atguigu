package designpattern.singleton;

/**
 * @ProjectName: code
 * @Package: designpattern.singleton.type1
 * @ClassName: Singleton1
 * @Author: guoyy
 * @Description: 单例模式之双重检查
 * @Date: 2021/8/29 下午2:57
 * @UpdateDate: 2021/8/29 下午2:57
 * @Version: 1.0
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton6{
    private static volatile Singleton6 instance;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if(instance == null){
            synchronized(Singleton6.class) {
                if(instance ==null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
