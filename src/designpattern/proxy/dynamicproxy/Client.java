package designpattern.proxy.dynamicproxy;

/**
 * @Package: designpattern.proxy.dynamicproxy
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试动态代理
 * @Date: 2021/11/24 下午11:24
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao) teacherDaoProxy.getProxyInstance();

        proxyInstance.teach();
        proxyInstance.sayHello("tom");
    }
}
