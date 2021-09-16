package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Coffee
 * @Author: guoyy
 * @Description:缓冲层
 * @Date: 2021/9/16 下午11:05
 * @UpdateDate: 2021/9/16 下午11:05
 * @Version: 1.0
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
