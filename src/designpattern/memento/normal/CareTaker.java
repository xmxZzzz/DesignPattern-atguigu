package designpattern.memento.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: designpattern.memento.normal
 * @ClassName: CareTaker
 * @Author: guoyy
 * @Description: 备份Memento的同意管理者
 * @Date: 2021/12/8 上午12:25
 * @Version: 1.0
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    /*
     * @Method addMemento
     * @Version  1.0
     * @Description 添加Memento
     * @param memento 待统一管理的Memento
     * @Return void
     * @Date 2021/12/8 上午12:27
     */
    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    /*
     * @Method getMemento
     * @Version  1.0
     * @Description 获取指定index的备份
     * @param index 备份的索引
     * @Return designpattern.memento.normal.Memento
     * @Exception
     * @Date 2021/12/8 上午12:27
     */
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

}
