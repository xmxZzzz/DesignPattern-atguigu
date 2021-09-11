package builder.improve;

/**
 * @ProjectName: code
 * @Package: builder.improve
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试建造者模式
 * @Date: 2021/9/11 下午10:14
 * @UpdateDate: 2021/9/11 下午10:14
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //测试普通房子
        HouseBuilder commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.getResult();
        System.out.println(house);

        //测试高楼
        HouseBuilder highBuilding = new HighBuilding();
        HouseDirector houseDirector1 = new HouseDirector(highBuilding);
        House house1 = houseDirector1.getResult();
        System.out.println(house1);
    }
}
