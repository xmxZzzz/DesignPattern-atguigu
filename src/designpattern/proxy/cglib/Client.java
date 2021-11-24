package designpattern.proxy.cglib;

/**
 * @Package: designpattern.proxy.cglib
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试cglib代理
 * @Date: 2021/11/25 上午12:31
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
