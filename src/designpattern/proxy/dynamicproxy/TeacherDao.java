package designpattern.proxy.dynamicproxy;

/**
 * @Package: designpattern.proxy.dynamicproxy
 * @ClassName: TeacherDao
 * @Author: guoyy
 * @Description: 目标对象，被代理对象
 * @Date: 2021/11/24 下午11:19
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("被代理对象正在执行teach。。。");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("被代理对象" + name + "正在执行sayHello。。。");
    }
}
