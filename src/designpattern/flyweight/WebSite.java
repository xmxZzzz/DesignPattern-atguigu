package designpattern.flyweight;

/**
 * @Package: designpattern.flyweight
 * @ClassName: WebSite
 * @Author: guoyy
 * @Description: 抽象的享元对象，包含一个抽象的方法及外部状态User
 * @Date: 2021/11/24 下午9:36
 * @Version: 1.0
 */
public abstract class WebSite {
    public abstract void use(User user);
}
