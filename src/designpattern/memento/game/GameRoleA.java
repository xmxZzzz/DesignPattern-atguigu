package designpattern.memento.game;

/**
 * @Package: designpattern.memento.game
 * @ClassName: GameRoleA
 * @Author: guoyy
 * @Description: 游戏角色A
 * @Date: 2021/12/8 上午12:32
 * @Version: 1.0
 */
public class GameRoleA {
    private int vit;
    private int def;

    /*
     * @Method createMemento
     * @Version  1.0
     * @Description 根据当前状态进行备份
     * @Return designpattern.memento.game.Memento 备份的对象
     * @Date 2021/12/8 上午12:35
     */
    public Memento createMemento() {
        return new Memento(this.vit, this.def);
    }

    /*
     * @Method recoverFromMemento
     * @Version  1.0
     * @Description 根据备份数据恢复当前状态
     * @param memento 备份数据
     * @Return void
     * @Date 2021/12/8 上午12:36
     */
    public void recoverFromMemento(Memento memento) {
        if (memento != null) {
            this.vit = memento.getVit();
            this.def = memento.getDef();
        } else {
            System.out.println("无指定备份");
        }
    }

    /*
     * @Method display
     * @Version  1.0
     * @Description 输出当前游戏角色的信息
     * @Return void
     * @Date 2021/12/8 上午12:37
     */
    public void display() {
        System.out.println("当前的vit: " + this.vit + ", def: " + this.def);
    }

    public GameRoleA(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
