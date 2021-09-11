package builder.tradition;

/**
 * @ProjectName: code
 * @Package: builder.tradition
 * @ClassName: CommonHouse
 * @Author: guoyy
 * @Description: 普通房子
 * @Date: 2021/9/11 下午2:58
 * @UpdateDate: 2021/9/11 下午2:58
 * @Version: 1.0
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
