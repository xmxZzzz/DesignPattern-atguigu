package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Drink
 * @Author: guoyy
 * @Description:被装饰者
 * @Date: 2021/9/16 下午11:04
 * @UpdateDate: 2021/9/16 下午11:04
 * @Version: 1.0
 */
public abstract class Drink {
    private String desc;
    private float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
