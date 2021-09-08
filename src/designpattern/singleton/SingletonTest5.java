package designpattern.singleton;

/**
 * @ProjectName: code
 * @Package: designpattern.singleton.type1
 * @ClassName: Singleton1
 * @Author: guoyy
 * @Description: 单例模式之懒汉式(线程安全，同步代码块)
 * @Date: 2021/8/29 下午2:57
 * @UpdateDate: 2021/8/29 下午2:57
 * @Version: 1.0
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
    }
}

//无法保证线程安全，不能使用！
class Singleton5{
    private static Singleton5 instance;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if(instance == null){
            synchronized(Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
