package designpattern.proxy.cglib;

/**
 * @Package: designpattern.proxy.cglib
 * @ClassName: TeacherDao
 * @Author: guoyy
 * @Description: 被代理对象、目标对象
 * @Date: 2021/11/25 上午12:19
 * @Version: 1.0
 */
public class TeacherDao {

    public void teach() {
        System.out.println("被代理类正在执行teach。。。");
    }
}
