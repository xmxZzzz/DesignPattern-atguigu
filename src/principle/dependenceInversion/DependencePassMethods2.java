package principle.dependenceInversion;

/**
 * @ProjectName: code
 * @Package: principle.dependenceInversion
 * @ClassName: DependencePassMethods1
 * @Author: guoyy
 * @Description: 依赖传递的方式二：构造方法传递
 * @Date: 2021/8/28 下午7:51
 * @UpdateDate: 2021/8/28 下午7:51
 * @Version: 1.0
 */
public class DependencePassMethods2 {
    public static void main(String[] args) {
        ITV2 tv = new ChangHong2();
        IOpenAndClose2 iOpenAndClose2 = new OpenAndClose2(tv);
        iOpenAndClose2.open();
    }
}

interface IOpenAndClose2 {
    void open();
}

interface ITV2 {
    void play();
}

class OpenAndClose2 implements IOpenAndClose2{

    private ITV2 tv;

    public OpenAndClose2(ITV2 tv){
        this.tv=tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

class ChangHong2 implements ITV2{
    @Override
    public void play() {
        System.out.println("长虹正在工作");
    }
}
