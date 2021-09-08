package principle.dependenceInversion;

/**
 * @ProjectName: code
 * @Package: principle.dependenceInversion
 * @ClassName: DependencePassMethods1
 * @Author: guoyy
 * @Description: 依赖传递的方式三：setter方法传递
 * @Date: 2021/8/28 下午7:51
 * @UpdateDate: 2021/8/28 下午7:51
 * @Version: 1.0
 */
public class DependencePassMethods3 {
    public static void main(String[] args) {
        ITV3 tv = new ChangHong3();
        IOpenAndClose3 iOpenAndClose = new OpenAndClose3();
        iOpenAndClose.setTV(tv);
        iOpenAndClose.open();
    }
}

interface IOpenAndClose3 {
    void open();
    void setTV(ITV3 tv);
}
interface ITV3 {
    void play();
}
class OpenAndClose3 implements IOpenAndClose3{

    private ITV3 tv;
    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTV(ITV3 tv) {
        this.tv = tv;
    }
}
class ChangHong3 implements ITV3{
    @Override
    public void play() {
        System.out.println("长虹正在工作");
    }
}
