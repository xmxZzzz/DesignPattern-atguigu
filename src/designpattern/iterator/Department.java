package designpattern.iterator;

/**
 * @Package: designpattern.iterator
 * @ClassName: Department
 * @Author: guoyy
 * @Description: 待遍历的元素类型
 * @Date: 2021/11/29 下午9:35
 * @Version: 1.0
 */
public class Department {
    private String name;
    private String desc;

    public Department() {
    }

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
