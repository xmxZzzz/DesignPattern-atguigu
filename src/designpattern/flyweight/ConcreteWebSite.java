package designpattern.flyweight;

/**
 * @Package: designpattern.flyweight
 * @ClassName: ConcreteWebSite
 * @Author: guoyy
 * @Description: 具体的享元角色
 * @Date: 2021/11/24 下午9:38
 * @Version: 1.0
 */
public class ConcreteWebSite extends WebSite {

    //表示网站的表现类型，即内部状态
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的表现类型为:" + type + " 使用者为:" + user.getName() + " 正在使用中");
    }
}
