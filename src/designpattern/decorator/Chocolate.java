package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Chocolate
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/16 下午11:19
 * @UpdateDate: 2021/9/16 下午11:19
 * @Version: 1.0
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("Chocolate");
        setPrice(2.0f);
    }
}
