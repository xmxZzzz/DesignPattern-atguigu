package designpattern.visitor;

/**
 * @Package: designpattern.visitor
 * @ClassName: Person
 * @Author: guoyy
 * @Description: 待完善
 * @Date: 2021/11/26 下午8:41
 * @Version: 1.0
 */
public abstract class Person {
    abstract void accept(Action action);
}
