package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Soy
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/16 下午11:21
 * @UpdateDate: 2021/9/16 下午11:21
 * @Version: 1.0
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDesc("Soy");
        setPrice(2.0f);
    }
}
