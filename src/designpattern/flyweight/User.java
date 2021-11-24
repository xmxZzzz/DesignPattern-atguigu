package designpattern.flyweight;

/**
 * @Package: designpattern.flyweight
 * @ClassName: User
 * @Author: guoyy
 * @Description: 表示外部状态，使用网站的不同用户
 * @Date: 2021/11/24 下午9:37
 * @Version: 1.0
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
