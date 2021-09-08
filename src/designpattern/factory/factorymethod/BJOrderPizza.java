package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.Pizza;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.factorymethod
 * @ClassName: BJOrderPizza
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午11:56
 * @UpdateDate: 2021/9/1 下午11:56
 * @Version: 1.0
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
