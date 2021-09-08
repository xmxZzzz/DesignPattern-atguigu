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
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("bj cheese pizza");
        System.out.println("bj cheese pizza is preparing");
    }
}
