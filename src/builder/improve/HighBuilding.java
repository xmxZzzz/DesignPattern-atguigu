package builder.improve;

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
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
