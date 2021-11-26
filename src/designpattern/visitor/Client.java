package designpattern.visitor;

/**
 * @Package: designpattern.visitor
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 待完善
 * @Date: 2021/11/26 下午8:41
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);
    }
}
