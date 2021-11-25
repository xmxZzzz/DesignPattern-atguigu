package designpattern.template;

/**
 * @Package: designpattern.template
 * @ClassName: PeanutSoyMilk
 * @Author: guoyy
 * @Description: 模板类AbstractSoyMilk的子类，重写add()方法
 * @Date: 2021/11/25 下午9:40
 * @Version: 1.0
 */
public class PeanutSoyMilk extends SoyMilk {
    @Override
    void add() {
        System.out.println("添加配料花生。。。");
    }
}
