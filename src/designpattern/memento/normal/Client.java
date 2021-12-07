package designpattern.memento.normal;

/**
 * @Package: designpattern.memento.normal
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试对于一个对象的备份管理
 * @Date: 2021/12/8 上午12:28
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("状态#1");
        //向careTaker中添加备份
        careTaker.addMemento(originator.createMemento());

        originator.setState("状态#2");
        //向careTaker中添加备份
        careTaker.addMemento(originator.createMemento());

        originator.setState("状态#3");
        //向careTaker中添加备份
        careTaker.addMemento(originator.createMemento());

        System.out.println("当前的状态是：" + originator.getState());

        //恢复到状态#2
        originator.recoverFromMemento(careTaker.getMemento(1));

        System.out.println("当前的状态是：" + originator.getState());
    }
}
