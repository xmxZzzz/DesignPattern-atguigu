package designpattern.factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.factorymethod
 * @ClassName: PizzaStore
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午11:59
 * @UpdateDate: 2021/9/1 下午11:59
 * @Version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "";
        do {
            loc = getLocType();
            if ("bj".equals(loc)) {
                new BJOrderPizza();
            } else if ("ld".equals(loc)) {
                new LDOrderPizza();
            }else{
                break;
            }
        }while(true);
    }

    private static String getLocType(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input loc: ");
        String loc = "";
        try {
            loc = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loc;
    }
}
