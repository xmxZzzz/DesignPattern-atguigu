package designpattern.builder.tradition;

/**
 * @ProjectName: code
 * @Package: builder.tradition
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试普通方法盖房子
 * @Date: 2021/9/11 下午2:59
 * @UpdateDate: 2021/9/11 下午2:59
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse commonHouse = new CommonHouse();
        commonHouse.build();

        System.out.println("-------------");

        AbstractHouse highBuilding = new HighBuilding();
        highBuilding.build();

    }
}
