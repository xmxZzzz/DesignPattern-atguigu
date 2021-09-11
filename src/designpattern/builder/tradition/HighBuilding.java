package designpattern.builder.tradition;

/**
 * @ProjectName: code
 * @Package: builder.tradition
 * @ClassName: CommonHouse
 * @Author: guoyy
 * @Description: 高楼
 * @Date: 2021/9/11 下午2:58
 * @UpdateDate: 2021/9/11 下午2:58
 * @Version: 1.0
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
