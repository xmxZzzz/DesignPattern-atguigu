package designpattern.builder.improve;

/**
 * @ProjectName: code
 * @Package: builder.improve
 * @ClassName: HouseBuilder
 * @Author: guoyy
 * @Description: 抽象建造者
 * @Date: 2021/9/11 下午10:06
 * @UpdateDate: 2021/9/11 下午10:06
 * @Version: 1.0
 */
public abstract class HouseBuilder {

    private House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House getResult() {
        return house;
    }
}
