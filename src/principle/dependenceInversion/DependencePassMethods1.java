package principle.dependenceInversion;

/**
 * @ProjectName: code
 * @Package: principle.dependenceInversion
 * @ClassName: DependencePassMethods1
 * @Author: guoyy
 * @Description: 依赖传递的方式一：接口传递
 * @Date: 2021/8/28 下午7:51
 * @UpdateDate: 2021/8/28 下午7:51
 * @Version: 1.0
 */
public class DependencePassMethods1 {
    public static void main(String[] args) {
        ITV1 tv = new ChangHong1();
        IOpenAndClose1 iOpenAndClose = new OpenAndClose1();
        iOpenAndClose.open(tv);
    }
}

interface IOpenAndClose1 {
    void open(ITV1 tv);
}

interface ITV1 {
    void play();
}

class OpenAndClose1 implements IOpenAndClose1{
    @Override
    public void open(ITV1 tv) {
        tv.play();
    }
}

class ChangHong1 implements ITV1{
    @Override
    public void play() {
        System.out.println("长虹正在工作");
    }
}