package designpattern.memento.game;

/**
 * @Package: designpattern.memento.game
 * @ClassName: Memento
 * @Author: guoyy
 * @Description: 游戏角色备份类
 * @Date: 2021/12/8 上午12:33
 * @Version: 1.0
 */
public class Memento {

    private int vit;
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getDef() {
        return def;
    }
}
