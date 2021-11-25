package designpattern.template;

/**
 * @Package: designpattern.template
 * @ClassName: PureSoyMilk
 * @Author: guoyy
 * @Description: 模板类AbstractSoyMilk的子类，重写add()方法,并使用钩子函数，即不执行add()
 * @Date: 2021/11/25 下午9:44
 * @Version: 1.0
 */
public class PureSoyMilk extends SoyMilk {
    /*
     * @Method add
     * @Description 虽然不执行该方法，但是继承抽象类必须实现抽象方法，因此设置为空方法
     * @Date 2021/11/25 下午9:47
     */
    @Override
    void add() {

    }

    /*
     * @Method isAdd
     * @Description 重写钩子方法，使得不执行add()
     * @Return boolean
     * @Date 2021/11/25 下午9:46
     */
    @Override
    boolean isAdd() {
        return false;
    }
}
