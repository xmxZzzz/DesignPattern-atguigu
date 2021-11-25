package designpattern.template;

/**
 * @Package: designpattern.template
 * @ClassName: AbstractSoyMilk
 * @Author: guoyy
 * @Description: 抽象类，模板类
 * @Date: 2021/11/25 下午9:35
 * @Version: 1.0
 */
public abstract class SoyMilk {
    /*
     * @Method make
     * @Description 定义算法流程
     * @Date 2021/11/25 下午9:36
     */
    public void make() {
        select();
        if (isAdd()) {
            add();
        }
        soak();
        beat();
    }

    /*
     * @Method add
     * @Description 抽象方法，用于子类重写
     * @Date 2021/11/25 下午9:38
     */
    abstract void add();

    /*
     * @Method isAdd
     * @Version  1.0
     * @Description 钩子函数，默认为需要执行add()方法
     * @param
     * @Return boolean
     * @Exception
     * @Date 2021/11/25 下午9:42
     */
    boolean isAdd() {
        return true;
    }


    /*
     * @Method select
     * @Description 通用方法，下同
     * @Date 2021/11/25 下午9:38
     */
    private void select() {
        System.out.println("选择原料。。。");
    }

    private void soak() {
        System.out.println("浸泡中。。。");
    }

    private void beat() {
        System.out.println("研磨中。。。");
    }
}
