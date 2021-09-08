package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.Pizza;
import designpattern.factory.simplefactory.SimpleFactory;

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
public abstract class OrderPizza {

    Pizza pizza = null;

    public OrderPizza(){

        String orderType="";
        do{
            orderType=getType();
            pizza = createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else{
                System.out.println("pizza订购失败");
                break;
            }

        }while(true);
    }

    abstract Pizza createPizza(String orderType);

    private String getType(){
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
