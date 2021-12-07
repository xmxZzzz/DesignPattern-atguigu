package designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {

    private Map<String, Colleague> colleagueMap;
    private Map<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    /*
     * @Method registry
     * @Version  1.0
     * @Description 注册具体Colleague对象
     * @param name  具体Colleague对象的名称
     * @param colleague 具体Colleague对象
     * @Date 2021/12/7 下午11:10
     */
    @Override
    public void registry(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", name);
        } else if (colleague instanceof TV) {
            interMap.put("TV", name);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", name);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", name);
        }
    }

    /*
     * @Method getMessage
     * @Version  1.0
     * @Description 具体中介者的核心方法
     *   1. 根据得到消息，完成对应任务
     *   2. 中介者在这个方法，协调各个具体的同事对象，完成任务
     * @param stateChange
     * @param name
     * @Return void
     * @Exception
     * @Date 2021/12/7 下午11:11
     */
    @Override
    public void getMessage(int stateChange, String name) {
        //如果是闹钟发来消息
        if (colleagueMap.get(name) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        } else if (colleagueMap.get(name) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();

        } else if (colleagueMap.get(name) instanceof TV) {

        } else if (colleagueMap.get(name) instanceof TV) {

        }
    }
}
