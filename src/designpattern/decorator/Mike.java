package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Mike
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/16 下午11:16
 * @UpdateDate: 2021/9/16 下午11:16
 * @Version: 1.0
 */
public class Mike extends Decorator {
    public Mike(Drink drink) {
        super(drink);
        setDesc("Mike");
        setPrice(1.0f);
    }
}
