package designpattern.proxy.staticproxy;

/**
 * @Package: designpattern.proxy.staticproxy
 * @ClassName: TeacherDaoProxy
 * @Author: guoyy
 * @Description: 代理类，扩展方法teach
 * @Date: 2021/11/24 下午10:41
 * @Version: 1.0
 */
public class TeacherDaoProxy implements ITeacherDao {

    //聚合被代理对象
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void tech() {
        System.out.println("代理对象开始代理。。。。");
        iTeacherDao.tech();
        System.out.println("代理对象结束代理。。。");
    }
}
