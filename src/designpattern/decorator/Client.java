package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Client
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/16 下午11:22
 * @UpdateDate: 2021/9/16 下午11:22
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Drink drink = new ShortBlack();
        System.out.println("咖啡：" + drink.getDesc());
        System.out.println("费用:" + drink.cost());

        drink = new Mike(drink);
        System.out.println("添加一份牛奶后的咖啡：" + drink.getDesc());
        System.out.println("添加一份牛奶后的费用:" + drink.cost());

        drink = new Mike(drink);
        System.out.println("添加两份牛奶后的咖啡：" + drink.getDesc());
        System.out.println("添加两份牛奶后的费用:" + drink.cost());

        drink = new Chocolate(drink);
        System.out.println("添加两份牛奶和一份巧克力后的咖啡：" + drink.getDesc());
        System.out.println("添加两份牛奶和一份巧克力后的费用:" + drink.cost());


    }
}
