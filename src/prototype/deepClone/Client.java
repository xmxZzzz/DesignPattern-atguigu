package prototype.deepClone;

/**
 * @ProjectName: code
 * @Package: prototype.deepClone
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试深拷贝
 * @Date: 2021/9/11 下午2:13
 * @UpdateDate: 2021/9/11 下午2:13
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("Cherry", 10);
        DeepPrototype deepPrototype1 = new DeepPrototype("Tom", deepCloneableTarget);

        //1、重写clone()方法(相关类都需要实现Cloneable接口)
//        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype1.clone();
//        DeepPrototype deepPrototype3 = (DeepPrototype) deepPrototype1.clone();
//        DeepPrototype deepPrototype4 = (DeepPrototype) deepPrototype1.clone();
//        DeepPrototype deepPrototype5 = (DeepPrototype) deepPrototype1.clone();

        //2、对象的序列化(相关类都需要实现Cloneable和Serial接口)
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype1.deepClone();
        DeepPrototype deepPrototype3 = (DeepPrototype) deepPrototype1.deepClone();
        DeepPrototype deepPrototype4 = (DeepPrototype) deepPrototype1.deepClone();
        DeepPrototype deepPrototype5 = (DeepPrototype) deepPrototype1.deepClone();

        System.out.println(deepPrototype1 + " - " + deepPrototype1.getDeepCloneableTarget().hashCode());
        System.out.println(deepPrototype2 + " - " + deepPrototype2.getDeepCloneableTarget().hashCode());
        System.out.println(deepPrototype3 + " - " + deepPrototype3.getDeepCloneableTarget().hashCode());
        System.out.println(deepPrototype4 + " - " + deepPrototype4.getDeepCloneableTarget().hashCode());
        System.out.println(deepPrototype5 + " - " + deepPrototype5.getDeepCloneableTarget().hashCode());
    }
}
