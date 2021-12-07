package designpattern.memento.normal;

/**
 * @Package: designpattern.memento.normal
 * @ClassName: Memento
 * @Author: guoyy
 * @Description: 备份
 * @Date: 2021/12/8 上午12:25
 * @Version: 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
