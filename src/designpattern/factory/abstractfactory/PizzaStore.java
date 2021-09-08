package designpattern.factory.abstractfactory;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.abstractfactory
 * @ClassName: PizzaStore
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/2 下午10:18
 * @UpdateDate: 2021/9/2 下午10:18
 * @Version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
