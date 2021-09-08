package designpattern.factory.abstractfactory;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.abstractfactory
 * @ClassName: AbsFactory
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/2 下午10:04
 * @UpdateDate: 2021/9/2 下午10:04
 * @Version: 1.0
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
