package designpattern.factory.abstractfactory;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.abstractfactory
 * @ClassName: BJOrderPizza
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/2 下午10:05
 * @UpdateDate: 2021/9/2 下午10:05
 * @Version: 1.0
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
