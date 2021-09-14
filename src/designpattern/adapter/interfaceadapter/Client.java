package designpattern.adapter.interfaceadapter;

/**
 * @ProjectName: code
 * @Package: designpattern.adapter.interfaceadapter
 * @ClassName: Client
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/12 上午12:14
 * @UpdateDate: 2021/9/12 上午12:14
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method1() {
                System.out.println("只使用method1()");
            }
        };
        absAdapter.method1();
    }
}
