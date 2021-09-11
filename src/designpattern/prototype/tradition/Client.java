package designpattern.prototype.tradition;

/**
 * @ProjectName: code
 * @Package: prototype.tradition
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试传统方式的克隆对象
 * @Date: 2021/9/11 下午1:19
 * @UpdateDate: 2021/9/11 下午1:19
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("Tom", 1, "white");
        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());

        System.out.println(sheep1 + " - " + sheep1.hashCode());
        System.out.println(sheep2 + " - " + sheep2.hashCode());
        System.out.println(sheep3 + " - " + sheep3.hashCode());
        System.out.println(sheep4 + " - " + sheep4.hashCode());
        System.out.println(sheep5 + " - " + sheep5.hashCode());
    }
}
