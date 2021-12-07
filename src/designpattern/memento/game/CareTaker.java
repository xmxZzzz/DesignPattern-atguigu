package designpattern.memento.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Package: designpattern.memento.game
 * @ClassName: CareTaker
 * @Author: guoyy
 * @Description: 统一管理者：对于多个游戏角色的状态管理
 * @Date: 2021/12/8 上午12:40
 * @Version: 1.0
 */
public class CareTaker {
    //key：游戏角色类名，value：该角色对应的所有备份
    private Map<String, ArrayList<Memento>> roleMementos = new HashMap<>();

    /*
     * @Method addMemento
     * @Version  1.0
     * @Description 向指定的角色中添加备份
     * @param rolename
     * @param memento
     * @Return void
     * @Exception
     * @Date 2021/12/8 上午12:48
     */
    public void addMemento(String rolename, Memento memento) {
        //如果当前careTaker中无该游戏角色的备份，则新建
        ArrayList<Memento> mementos;
        if (!roleMementos.containsKey(rolename)) {
            mementos = new ArrayList<>();
        } else {
            //否则，找到该游戏角色备份列表，并添加新的备份
            mementos = roleMementos.get(rolename);
        }
        mementos.add(memento);
        roleMementos.put(rolename, mementos);
    }

    /*
     * @Method getMemento
     * @Version  1.0
     * @Description 根据指定的游戏角色和索引，获取备份
     * @param rolename 指定的游戏角色
     * @param index 指定的索引
     * @Return designpattern.memento.game.Memento 返回指定游戏角色的备份信息
     * @Date 2021/12/8 上午12:50
     */
    public Memento getMemento(String rolename, int index) {
        ArrayList<Memento> mementos = roleMementos.get(rolename);
        return mementos.size() > index ? mementos.get(index) : null;
    }
}
