package designpattern.factory.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.abstractfactory
 * @ClassName: OrderPizza
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/2 下午10:09
 * @UpdateDate: 2021/9/2 下午10:09
 * @Version: 1.0
 */
public class OrderPizza {
    AbsFactory absFactory;
    public OrderPizza(AbsFactory absFactory){
       setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory){
        String orderType="";
        Pizza pizza = null;
        this.absFactory = absFactory;
        do{
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if(pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }

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
