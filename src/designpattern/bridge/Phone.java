package designpattern.bridge;

/**
 * @ProjectName: code
 * @Package: designpattern.bridge
 * @ClassName: Phone
 * @Author: guoyy
 * @Description: 手机
 * @Date: 2021/9/14 下午10:24
 * @UpdateDate: 2021/9/14 下午10:24
 * @Version: 1.0
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
