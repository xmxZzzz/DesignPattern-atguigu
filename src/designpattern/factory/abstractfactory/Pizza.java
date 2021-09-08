package designpattern.factory.abstractfactory;

/**
 * @ProjectName: code
 * @Package: designpattern.factory.trandition
 * @ClassName: Pizza
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/1 下午10:27
 * @UpdateDate: 2021/9/1 下午10:27
 * @Version: 1.0
 */
public abstract class Pizza {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(this.name+" backing");
    }
    public void cut(){
        System.out.println(this.name+" cutting");
    }
    public void box(){
        System.out.println(this.name+" boxing");
    }
}
