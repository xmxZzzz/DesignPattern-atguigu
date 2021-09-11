package prototype.clone;

/**
 * @ProjectName: code
 * @Package: prototype.clone
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试默认clone()方法
 * @Date: 2021/9/11 下午1:27
 * @UpdateDate: 2021/9/11 下午1:27
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("Tom", 1, "blue");
        sheep1.setFriend(new Sheep("Cherry", 1, "yellow"));

        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();

        //浅拷贝，对象属性frient的hashCode值都相同
        System.out.println(sheep1 + " - " + sheep1.getFriend().hashCode());
        System.out.println(sheep2 + " - " + sheep2.getFriend().hashCode());
        System.out.println(sheep3 + " - " + sheep3.getFriend().hashCode());
        System.out.println(sheep4 + " - " + sheep4.getFriend().hashCode());
        System.out.println(sheep5 + " - " + sheep5.getFriend().hashCode());
    }
}
