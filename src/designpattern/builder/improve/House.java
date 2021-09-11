package designpattern.builder.improve;

/**
 * @ProjectName: code
 * @Package: builder.tradition.improve
 * @ClassName: House
 * @Author: guoyy
 * @Description: 产品
 * @Date: 2021/9/11 下午10:03
 * @UpdateDate: 2021/9/11 下午10:03
 * @Version: 1.0
 */
public class House {
    private String basic;
    private String walls;
    private String roof;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
