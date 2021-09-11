package builder.improve;

/**
 * @ProjectName: code
 * @Package: builder.improve
 * @ClassName: HouseDirector
 * @Author: guoyy
 * @Description: 指挥者
 * @Date: 2021/9/11 下午10:12
 * @UpdateDate: 2021/9/11 下午10:12
 * @Version: 1.0
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getResult() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.getResult();
    }
}
