package designpattern.template;

/**
 * @Package: designpattern.template
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试模板方法模式
 * @Date: 2021/11/25 下午9:48
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==========制作PeanutSoyMilk==========");
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();

        System.out.println("==========制作RedBeanSoyMilk==========");
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("==========制作PureSoyMilk==========");
        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
