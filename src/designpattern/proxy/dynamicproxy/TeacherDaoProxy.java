package designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Package: designpattern.proxy.dynamicproxy
 * @ClassName: TeacherdaoProxy
 * @Author: guoyy
 * @Description: 动态代理类
 * @Date: 2021/11/24 下午11:21
 * @Version: 1.0
 */
public class TeacherDaoProxy {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    /*
     * @Method getProxyInstance
     * @Version  1.0
     * @Description 使用JDK中的代理方法Proxy.newProxyInstance()实现动态代理
     * @param ClassLoader loader 被代理对象的类加载器
     * @param Class<?>[] interfaces 被代理对象实现的接口类型
     * @param InvocationHandler h 事件处理器
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/11/24 下午11:24
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理对象正在执行。。。");
                Object obj = method.invoke(target, args);
                System.out.println("动态代理对象执行完毕。。。");
                return obj;
            }
        });
    }
}
