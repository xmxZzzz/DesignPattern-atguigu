package designpattern.proxy.staticproxy;

/**
 * @Package: designpattern.proxy.staticproxy
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试静态代理
 * @Date: 2021/11/24 下午10:43
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.tech();
    }
}
