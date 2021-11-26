package designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Package: designpattern.visitor
 * @ClassName: ObjectStructure
 * @Author: guoyy
 * @Description: 待完善
 * @Date: 2021/11/26 下午8:41
 * @Version: 1.0
 */
public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (Person p : personList) {
            p.accept(action);
        }
    }

}
