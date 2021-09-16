package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Espresso
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/16 下午11:12
 * @UpdateDate: 2021/9/16 下午11:12
 * @Version: 1.0
 */
public class Espresso extends Coffee {
    public Espresso() {
        super.setDesc("Espresso");
        super.setPrice(7.0f);
    }
}
