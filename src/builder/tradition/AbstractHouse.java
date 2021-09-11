package builder.tradition;

/**
 * @ProjectName: code
 * @Package: builder.tradition
 * @ClassName: AbstractHouse
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/11 下午2:55
 * @UpdateDate: 2021/9/11 下午2:55
 * @Version: 1.0
 */
public abstract class AbstractHouse {
    //盖房的三个步骤
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
