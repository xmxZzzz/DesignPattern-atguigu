package designpattern.factory.simplefactory;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.trandition
 * @ClassName: PizzaStore
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午10:38
 * @UpdateDate: 2021/9/1 下午10:38
 * @Version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        //简单工厂模式
//        new OrderPizza(new SimpleFactory());

        //静态工厂模式
        new OrderPizzaStatic();
    }
}
