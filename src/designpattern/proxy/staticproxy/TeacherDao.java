package designpattern.proxy.staticproxy;

/**
 * @Package: designpattern.proxy.staticproxy
 * @ClassName: TeacherDao
 * @Author: guoyy
 * @Description: 目标对象，即被代理对象
 * @Date: 2021/11/24 下午10:39
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void tech() {
        System.out.println("被代理对象正在使用。。。");
    }
}
