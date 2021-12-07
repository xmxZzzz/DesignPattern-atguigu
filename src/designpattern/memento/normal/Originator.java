package designpattern.memento.normal;

public class Originator {
    private String state;

    /*
     * @Method createMemento
     * @Version  1.0
     * @Description 创建一个备份Memento
     * @Return designpattern.memento.normal.Memento
     * @Date 2021/12/8 上午12:24
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /*
     * @Method recoverFromMemento
     * @Version  1.0
     * @Description 根据备份Memento进行恢复
     * @param memento 从Caretaker中获取的备份
     * @Return void
     * @Date 2021/12/8 上午12:24
     */
    public void recoverFromMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
