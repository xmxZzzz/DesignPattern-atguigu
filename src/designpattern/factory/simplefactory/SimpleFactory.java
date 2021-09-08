package designpattern.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.simplefactory
 * @ClassName: SimpleFactory
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午10:41
 * @UpdateDate: 2021/9/1 下午10:41
 * @Version: 1.0
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else if("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }
        return pizza;
    }

    public static Pizza createPizzaStatic(String orderType){
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else if("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }
        return pizza;
    }
}
