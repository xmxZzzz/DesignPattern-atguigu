package designpattern.builder.improve;

/**
 * @ProjectName: code
 * @Package: builder.improve
 * @ClassName: CommonHouse
 * @Author: guoyy
 * @Description: 具体建造者
 * @Date: 2021/9/11 下午10:10
 * @UpdateDate: 2021/9/11 下午10:10
 * @Version: 1.0
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基1米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙5cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
