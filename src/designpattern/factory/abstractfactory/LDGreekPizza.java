package designpattern.factory.abstractfactory;

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
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("ld greek pizza");
        System.out.println("ld greek pizza is preparing");
    }
}
