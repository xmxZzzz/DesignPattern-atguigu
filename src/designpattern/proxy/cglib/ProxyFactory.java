package designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Package: designpattern.proxy.cglib
 * @ClassName: ProxyFactory
 * @Author: guoyy
 * @Description: cglib代理对象
 * @Date: 2021/11/25 上午12:20
 * @Version: 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /*
     * @Method getProxyInstance
     * @Version  1.0
     * @Description 获取一个代理对象：是target的代理对象
     * @param
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/11/25 上午12:22
     */
    public Object getProxyInstance() {
        //1、创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2、设置父类
        enhancer.setSuperclass(target.getClass());
        //3、设置回调函数
        enhancer.setCallback(this);
        //4、创建子类，即代理对象
        return enhancer.create();
    }

    /*
     * @Method intercept
     * @Version  1.0
     * @Description 重写intercept方法，拓展目标对象的方法
     * @param o cglib动态生成的代理类实例
     * @param method 待执行的方法
     * @param args 传递的参数
     * @param methodProxy 生成的代理类对方法的代理引用
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/11/25 上午12:26
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理正在执行。。。");
        Object res = method.invoke(target, args);
        System.out.println("cglib代理结束执行。。。");
        return res;
    }
}
