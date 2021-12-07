package designpattern.memento.game;

/**
 * @Package: designpattern.memento.game
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试备忘录模式：备份多个游戏角色的信息
 * @Date: 2021/12/8 上午12:53
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        GameRoleA gameRoleA = new GameRoleA(100, 100);
        GameRoleB gameRoleB = new GameRoleB(100, 100);

        System.out.println("========原始的两个游戏角色信息========");
        gameRoleA.display();
        gameRoleB.display();

        System.out.println("========第一次修改并备份状态后的两个游戏角色信息========");
        gameRoleA.setVit(90);
        gameRoleB.setDef(95);
        careTaker.addMemento("gameRoleA", gameRoleA.createMemento());
        careTaker.addMemento("gameRoleB", gameRoleB.createMemento());
        gameRoleA.display();
        gameRoleB.display();

        System.out.println("========第二次修改并备份状态后的两个游戏角色信息========");
        gameRoleA.setDef(80);
        gameRoleB.setVit(85);
        careTaker.addMemento("gameRoleA", gameRoleA.createMemento());
        careTaker.addMemento("gameRoleB", gameRoleB.createMemento());
        gameRoleA.display();
        gameRoleB.display();


        System.out.println("========测试gameRoleA无指定第三次备份========");
        gameRoleA.recoverFromMemento(careTaker.getMemento("gameRoleA", 2));

        System.out.println("========gameRoleA恢复到第2次备份，gameRoleB恢复到第1次备份后的两个游戏角色信息========");
        //gameRoleA恢复到第2次备份，gameRoleB恢复到第1次备份
        gameRoleA.recoverFromMemento(careTaker.getMemento("gameRoleA", 1));
        gameRoleB.recoverFromMemento(careTaker.getMemento("gameRoleB", 0));
        gameRoleA.display();
        gameRoleB.display();

    }
}
