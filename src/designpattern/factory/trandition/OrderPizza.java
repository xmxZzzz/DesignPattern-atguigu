package designpattern.factory.trandition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.trandition
 * @ClassName: OrderPizza
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午10:30
 * @UpdateDate: 2021/9/1 下午10:30
 * @Version: 1.0
 */
public class OrderPizza {
    public OrderPizza(){
        String orderType="";
        Pizza pizza = null;
        do{
            orderType=getType();
            if("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setName("cheese");
            }else if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("greek");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    public String getType(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input pizza type: ");
        String pizzaType = "";
        try {
            pizzaType = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pizzaType;
    }
}
