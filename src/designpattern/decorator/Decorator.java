package designpattern.decorator;

/**
 * @ProjectName: code
 * @Package: designpattern.decorator
 * @ClassName: Decorator
 * @Author: guoyy
 * @Description:装饰
 * @Date: 2021/9/16 下午11:13
 * @UpdateDate: 2021/9/16 下午11:13
 * @Version: 1.0
 */
public abstract class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + super.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " " + super.getPrice() + " " + drink.getDesc();
    }
}
