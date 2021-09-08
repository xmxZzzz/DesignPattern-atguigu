package designpattern.factory.trandition;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.trandition
 * @ClassName: CheesePizza
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午10:28
 * @UpdateDate: 2021/9/1 下午10:28
 * @Version: 1.0
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("greek pizza is preparing");
    }
}
