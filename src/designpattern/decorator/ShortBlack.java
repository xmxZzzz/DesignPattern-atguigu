package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: ShortBlack
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/16 下午11:08
 * @UpdateDate: 2021/9/16 下午11:08
 * @Version: 1.0
 */
public class ShortBlack extends Coffee {

    public ShortBlack() {
        super.setDesc("ShortBlack");
        super.setPrice(6.0f);
    }
}
